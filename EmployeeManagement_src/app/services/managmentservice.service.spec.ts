import { TestBed } from '@angular/core/testing';

import { ManagmentserviceService } from './managmentservice.service';

describe('ManagmentserviceService', () => {
  let service: ManagmentserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ManagmentserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
