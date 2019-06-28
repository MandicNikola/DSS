import { Component, OnInit, Input } from '@angular/core';


import { Pregled } from '../../model/Pregled';

@Component({
  selector: 'app-graf',
  templateUrl: './graf.component.html',
  styleUrls: ['./graf.component.css']
})
export class GrafComponent implements OnInit {

  @Input() pregled : Pregled;

  constructor() { }

  ngOnInit() {
  }

}
