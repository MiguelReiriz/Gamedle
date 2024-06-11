import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { GameListComponent } from './game-list/game-list.component';
import { GameMainComponent } from './game-main/game-main.component';
import { GamePlayComponent } from './game-play/game-play.component';


@NgModule({
  declarations: [
    AppComponent,
    GameListComponent,
    GameMainComponent,
    GamePlayComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
