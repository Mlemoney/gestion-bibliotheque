import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { ListLivreComponent } from './components/livre/list-livre/list-livre.component';
import { AddLivreComponent } from './components/livre/add-livre/add-livre.component';
import { EditLivreComponent } from './components/livre/edit-livre/edit-livre.component';
import { ListAuteurComponent } from './components/auteur/list-auteur/list-auteur.component';
import { AddAuteurComponent } from './components/auteur/add-auteur/add-auteur.component';
import { EditAuteurComponent } from './components/auteur/edit-auteur/edit-auteur.component';
import { ListEmpruntComponent } from './components/emprunt/list-emprunt/list-emprunt.component';
import { AddEmpruntComponent } from './components/emprunt/add-emprunt/add-emprunt.component';
import { EditEmpruntComponent } from './components/emprunt/edit-emprunt/edit-emprunt.component';
import { AppRoutingModule } from './app-routing.module';


import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListLivreComponent,
    AddLivreComponent,
    EditLivreComponent,
    ListAuteurComponent,
    AddAuteurComponent,
    EditAuteurComponent,
    ListEmpruntComponent,
    AddEmpruntComponent,
    EditEmpruntComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule // Ajout du module d'animations
  ],
  providers: [
    provideHttpClient(withInterceptorsFromDi())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
