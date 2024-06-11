import { Component, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
numberInput: number | null = null;
  result: string | null = null;

  constructor(private http: HttpClient) {}

  transformNumber() {
    if (this.numberInput !== null) {
      this.http.get(`http://localhost:8080/api/kata/transform?number=${this.numberInput}`, { responseType: 'text' })
        .subscribe(response => {
          this.result = response;
        });
    }
  }
}
