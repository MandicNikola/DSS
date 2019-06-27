import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ZavrsiPregledComponent } from './zavrsi-pregled.component';

describe('ZavrsiPregledComponent', () => {
  let component: ZavrsiPregledComponent;
  let fixture: ComponentFixture<ZavrsiPregledComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ZavrsiPregledComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ZavrsiPregledComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
