import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChatComponent } from './components/chat/chat.component'
import { MainComponent } from './components/main/main.component';
import { UserComponent } from './components/user/user.component';

const routes: Routes = [
  { path: 'chat', component: ChatComponent },
  { path: 'user', component: UserComponent },
  { path: '', component: MainComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
