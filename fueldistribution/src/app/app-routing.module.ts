import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllocationComponent } from './allocation/allocation.component';
import { DispatchComponent } from './dispatch/dispatch.component';
import { HomeComponent } from './home/home.component';
import { OrdernowComponent } from './ordernow/ordernow.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'ordernow',component:OrdernowComponent},
  {path:'allocation',component:AllocationComponent},
  {path:'dispatch',component:DispatchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
