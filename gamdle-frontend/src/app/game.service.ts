import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Game } from './game';

@Injectable({
  providedIn: 'root'
})
export class GameService {


  //URL que lista todos los juegos
  private baseURL = "http://localhost:8080/game";


  constructor(private httpClient : HttpClient) { }
  //Metodo obtener juegos
  obtenerListaGames():Observable<Game[]>{
    return this.httpClient.get<Game[]>(`${this.baseURL}`);
  }
}
