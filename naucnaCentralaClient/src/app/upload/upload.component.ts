import { Component, OnInit } from '@angular/core';
import { PretragaService } from '../pretraga.service';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent implements OnInit {

  private fileToUpload : File;

  constructor(public pretragaService: PretragaService) { }

  ngOnInit() {
  }


  
  private handleFileInput(files: FileList) {
     this.fileToUpload = files.item(0);
     this.pretragaService.uploadPdfFileHttpClient(this.fileToUpload).
      then(    
         );
  }
}
