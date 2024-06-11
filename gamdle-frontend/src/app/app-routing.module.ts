import { GamePlayComponent } from './game-play/game-play.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GameListComponent } from './game-list/game-list.component';

const routes: Routes = [
  {path: 'gameList', component:GameListComponent},
  {path: 'gamePlay', component:GamePlayComponent},
  {path:'', redirectTo:'games',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
