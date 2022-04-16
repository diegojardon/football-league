alter table Team_by_Category
    change category_id categoryId int not null;

alter table Team_by_Category
    change team_id teamId int not null;

alter table Team_by_Category
    change coach_id refereeId int not null;

alter table Team_by_Category
    add constraint Team_by_Category___fkCategory
        foreign key (categoryId) references Category (id)
            on update cascade on delete cascade;

alter table Team_by_Category
    add constraint Team_by_Category___fkTeam
        foreign key (teamId) references Team (id)
            on update cascade on delete cascade;

alter table Team_by_Category
    add constraint Team_by_Category___fkReferee
        foreign key (refereeId) references Referee (id);

alter table Player
    add constraint Player___fkPosition
        foreign key (positionId) references Position (id)
            on update cascade on delete cascade;

alter table Player_in_Category_by_Team
    add constraint Player_in_Category_by_Team___fkPlayer
        foreign key (playerId) references Player (id);

alter table Player_in_Category_by_Team
    add constraint Player_in_Category_by_Team___fkTeam
        foreign key (teamByCategoryId) references Team_by_Category (id)
            on update cascade on delete cascade;

alter table Soccer_match_detail
    add constraint Soccer_match_detail___fkMatch
        foreign key (matchId) references Soccer_match (id)
            on update cascade on delete cascade;

alter table Soccer_match_detail
    add constraint Soccer_match_detail___fkPlayer
        foreign key (playerId) references Player (id);