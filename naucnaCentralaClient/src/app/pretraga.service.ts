import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { NaucniRad } from './model/naucniRad';

@Injectable({
  providedIn: 'root'
})
export class PretragaService {

  private SERVER_URL = "https://localhost:7000";

  constructor(private http : Http) { }

  uploadPdfFileHttpClient(file: File){

    const endpoint = 'your-destination-url';
    const formData: FormData = new FormData();
    formData.append('file', file, file.name);

    return this.http.post(this.SERVER_URL + "/elasticsearch/uploadPdf", formData).map(res => res.toString());
  }
  
}
