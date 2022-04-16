create table User
(
    id            int auto_increment,
    username      varchar(25) not null,
    userPassword  varchar(25) not null,
    userRole      varchar(10) not null,
    firstName     varchar(30) not null,
    lastName      varchar(50) not null,
    lastLoginDate timestamp   not null,
    signupDate    timestamp   null,
    constraint User_pk
        primary key (id)
);

create table Team
(
    id               int auto_increment,
    teamName         varchar(40)  not null,
    address          varchar(150) not null,
    contactPhone     varchar(13)  null,
    contactEmail     varchar(30)  null,
    website          varchar(60)  null,
    shortDescription varchar(200) not null,
    constraint Team_pk
        primary key (id)
);

create table Category
(
    id           int auto_increment,
    categoryName varchar(40) not null,
    ageRange     varchar(20) not null,
    forMales     boolean     not null,
    forFemales   boolean     not null,
    capacity     int         not null,
    constraint Category_pk
        primary key (id)
);

create table Team_by_Category
(
    id          int auto_increment,
    category_id int not null,
    team_id     int not null,
    coach_id    int not null,
    constraint Team_by_Category_pk
        primary key (id)
);

create table Player
(
    id             int auto_increment,
    playerName     varchar(40)  not null,
    playerLastName varchar(40)  not null,
    age            int          null,
    height         float        null,
    weight         float        null,
    selfie         varchar(200) null,
    startDate      timestamp    not null,
    positionId     int          not null,
    constraint Player_pk
        primary key (id)
);

create table Player_in_Category_by_Team
(
    id               int auto_increment,
    teamByCategoryId int not null,
    playerId         int not null,
    constraint Player_in_Category_by_Team_pk
        primary key (id)
);

create table Coach
(
    id            int auto_increment,
    coachName     varchar(30) not null,
    coachLastName varchar(40) not null,
    age           int         null,
    startDate     timestamp   null,
    constraint Coach_pk
        primary key (id)
);

create table Soccer_match
(
    id                      int auto_increment,
    matchDate               timestamp  not null,
    localTeamByCategoryId   int        not null,
    visitorTeamByCategoryId int        not null,
    finalScore              varchar(7) null,
    firstHalfScore          varchar(7) null,
    secondHalfScore         varchar(7) null,
    hasOvertime             boolean    null,
    firstOvertimeScore      varchar(7) null,
    secondOvertimeScore     varchar(7) null,
    hasPenaltyKicks         int        null,
    penaltiesScore          varchar(7) null,
    constraint Soccer_match_pk
        primary key (id)
);

create table Referee
(
    id                       int auto_increment,
    refereeName              varchar(30) not null,
    refereeLastName          varchar(30) not null,
    age                      int         null,
    totalParticipatedMatches int         null,
    constraint Referee_pk
        primary key (id)
);

create table Soccer_match_detail
(
    id                    int auto_increment,
    matchId               int     not null,
    playerId              int     not null,
    totalYellowCards      int     null,
    totalRedCards         int     null,
    totalGoalsScored      int     null,
    substituted           boolean null,
    minuteSubstitutionOut int     null,
    minuteSubstitutionIn  int     null,
    constraint Soccer_match_detail_pk
        primary key (id)
);