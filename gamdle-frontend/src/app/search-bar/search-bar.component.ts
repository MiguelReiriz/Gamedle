import { Component, OnInit } from '@angular/core';
import { Game } from '../game';
import { GameService } from '../game.service';

@Component({
  selector: 'app-search-bar',
  templateUrl: './search-bar.component.html',
  styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent implements OnInit{
  
  sendData(event: any){
    console.log(event.target.value)
    }
  constructor(private gameService:GameService) { }

  ngOnInit(): void {
  }
 
}
