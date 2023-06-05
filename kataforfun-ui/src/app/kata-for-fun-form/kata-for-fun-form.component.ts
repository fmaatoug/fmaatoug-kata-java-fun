import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent implements OnInit {
  @Output() submitNumberOutput : EventEmitter<number> = new EventEmitter()
  inputNumber : number;
  kataGroup : FormGroup = this.formBuilder.group({
    'kataNumber': this.formBuilder.control(null, [Validators.required])
  })


  constructor(private formBuilder: FormBuilder) {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    if (!this.kataGroup.valid) {
      alert('Please add number!');
      return;
    }

    this.inputNumber =  this.kataGroup.get('kataNumber').value;

  //todo emit event 
  this.submitNumberOutput.emit(this.inputNumber)

  this.inputNumber = null

  }
   

}
