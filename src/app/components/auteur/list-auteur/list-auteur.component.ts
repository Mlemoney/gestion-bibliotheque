import { Component, OnInit } from '@angular/core';
import { AuteurService } from '../../../services/auteur.service';
import { Auteur } from '../../../models/auteur.model';

@Component({
  selector: 'app-list-auteur',
  templateUrl: './list-auteur.component.html',
  styleUrls: ['./list-auteur.component.css']
})
export class ListAuteurComponent implements OnInit {
  auteurs: Auteur[] = [];

  constructor(private auteurService: AuteurService) { }

  ngOnInit(): void {
    this.auteurService.getAuteurs().subscribe(data => {
      this.auteurs = data;
    });
  }

  deleteAuteur(id: number): void {
    this.auteurService.deleteAuteur(id).subscribe(() => {
      this.auteurs = this.auteurs.filter(auteur => auteur.id !== id);
    });
  }
}
