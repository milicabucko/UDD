import { Component, OnInit } from '@angular/core';
import { Constants } from '../constants/constants';

@Component({
  selector: 'app-pretraga',
  templateUrl: './pretraga.component.html',
  styleUrls: ['./pretraga.component.css']
})
export class PretragaComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  tipovi = [
    {value: Constants.PRETRAZI_PO_NAZIVU, viewValue: 'Naziv'},
    {value: Constants.PRETRAZI_PO_NASLOVU, viewValue: 'Naslov'},
    {value: Constants.PRETRAZI_PO_AUTORU, viewValue: 'Autor'},
    {value: Constants.PRETRAZI_PO_NAUCNA_OBLAST, viewValue: 'Naucna oblast'},
    {value: Constants.PRETRAZI_PO_SADRZAJ, viewValue: 'Sadrzaj'},
    {value: Constants.PRETRAZI_PO_KLJUCNI_POJMOVI, viewValue: 'Kljucni pojmovi'}
  ];

  vrste =  [
    {value: Constants.BOOLEAN_QUERY, viewValue: 'Boolean'},
    {value: Constants.PHRAZEQUERY, viewValue: 'Phraze'}
  ];

  bvrste = [
    {value: Constants.AND, viewValue: 'And'},
    {value: Constants.OR, viewValue: 'Or'}
  ]

  private handleFileInput(files: FileList) {
    // this.fileToUpload = files.item(0);
    // this.ebookService.uploadEBookFileHttpClient(this.fileToUpload).
    //   then(data => 
    //     {
    //       if(this.originalEbookForChange != null && this.selectedEbookForChange != null){
            
    //         this.originalEbookForChange = data;
    //         this.originalEbookForChange.language = this.languages[0];
    //         this.originalEbookForChange.category = this.categories[0];
    //         this.originalEbookForChange.user = this.user;

    //         if(data.author == null){
    //           this.originalEbookForChange.author = "";
    //         }
    //         if(data.keywords == null){
    //           this.originalEbookForChange.keywords = "";
    //         }
    //         if(data.mime == null){
    //           this.originalEbookForChange.mime = "";
    //         }
    //         if(data.publicationYear == null){
    //           this.originalEbookForChange.publicationYear = 0;
    //         }
    //         if(data.title == null){
    //           this.originalEbookForChange.title = "";
    //         }

    //         this.selectedEbookForChange = this.originalEbookForChange;
    //       }
    //     });
  }
}
