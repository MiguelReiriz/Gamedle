import { GameService } from './game.service';
import { Component } from '@angular/core';
import { Game } from './game';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  games:Array<Game> = [];
  
  constructor(private gameService: GameService){

  }


  }

