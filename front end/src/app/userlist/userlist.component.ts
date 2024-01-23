import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { AuthService } from '../_services/auth.service';
import { User } from '../user';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  users!: User[];

  constructor(private authService: AuthService) {
  }

  ngOnInit() {
    this.authService.findAll().subscribe(data => {
      this.users = data;
    });
  }
}