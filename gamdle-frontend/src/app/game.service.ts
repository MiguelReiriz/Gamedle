import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map, tap } from 'rxjs';
import { Game } from './game';

@Injectable({
  providedIn: 'root'
})
export class GameService {
  
  //URL que lista todos los juegos
  private baseURL = "http://localhost:8080/game";
  private NamesURL= "http://localhost:8080/game/AllNames"

  constructor(private httpClient : HttpClient) { }
  //Metodo obtener juegos
  getGames(): Observable<Game[]> {
    return this.httpClient.get<Game[]>(`${this.baseURL}`).pipe(
      tap(dato => console.log('Datos recibidos:', dato))
    );
  }
  getNames(): Observable<string[]> {
    return this.httpClient.get<string[]>(this.NamesURL);
  }
 
}
