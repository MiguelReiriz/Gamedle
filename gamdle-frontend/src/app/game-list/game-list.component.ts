import { GameService } from './../game.service';
import { Component, OnInit } from '@angular/core';
import { Game } from '../game';

@Component({
  selector: 'app-game-list',
  templateUrl: './game-list.component.html',
  styleUrls: ['./game-list.component.css']
})
export class GameListComponent implements OnInit{

  games:Game[];

  constructor(private gameService:GameService) { }

  ngOnInit(): void {
    this.getGames();
   }
   private getGames(){
    this.gameService.obtenerListaGames().subscribe(dato =>{
      this.games = dato;
    })
   }


  }

