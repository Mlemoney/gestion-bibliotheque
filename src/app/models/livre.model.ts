// livre.model.ts
export class Livre {
  id: number;
  titre: string;
  auteur: string;
  datePublication: Date;
  isbn: string;
  genre: string;

  constructor(id: number, titre: string, auteur: string, datePublication: Date, isbn: string, genre: string) {
    this.id = id;
    this.titre = titre;
    this.auteur = auteur;
    this.datePublication = datePublication;
    this.isbn = isbn;
    this.genre = genre;
  }
}
