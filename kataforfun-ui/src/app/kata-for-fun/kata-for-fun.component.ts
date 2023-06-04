import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {
  convertedNumbers: NumberConverted[] = []

  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  //todo complete the call
  convertNumber(inputNumber: number): void {
    console.log(inputNumber)
    this.kataForFunService.convertNumber(inputNumber).subscribe((gotresult) => this.convertedNumbers.push(  ));
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
