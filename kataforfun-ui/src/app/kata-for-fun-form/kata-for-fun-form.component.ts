import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent implements OnInit {
  @Output() submitNumberOutput : EventEmitter<number> = new EventEmitter()
  inputNumber : number;


  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    if (!this.inputNumber) {
      alert('Please add number!');
      return;
    }

    const input: number =  this.inputNumber  

  //todo emit event 
  this.submitNumberOutput.emit(this.inputNumber)

  this.inputNumber = null

  }
   

}
