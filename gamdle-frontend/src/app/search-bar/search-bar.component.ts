import { Component, OnInit } from '@angular/core';
import { Game } from '../game';
import { FormControl } from '@angular/forms';
import { Observable } from 'rxjs';
import { map, startWith } from 'rxjs/operators';
import { GameService } from '../game.service';

@Component({
  selector: 'app-search-bar',
  templateUrl: './search-bar.component.html',
  styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent implements OnInit{
  gameControl = new FormControl();
  nombresJuego: string[] = []; // Arreglo para almacenar los nombres de los juegos
  filteredGames: Observable<string[]>;
  sendData(event: any){
    console.log(event.target.value)
    }
  constructor(private gameService:GameService) { }

  ngOnInit(): void {
    this.getNames();
    this.filteredGames = this.gameControl.valueChanges.pipe(
      startWith(''),
      map(value => this._filterGames(value))
    );
  }
  private getNames() {
    this.gameService.getNames().subscribe(
      nombres => {
        this.nombresJuego = nombres;
      }
    );
  }
  private _filterGames(value: string): string[] {
    const filterValue = value.toLowerCase();
    // Filtrar juegos basado en el valor de búsqueda
    return this.nombresJuego.filter(game => game.toLowerCase().includes(filterValue));
  }
 
}
