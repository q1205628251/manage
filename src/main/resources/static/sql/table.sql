create table items(
     itemId int not null auto_increment,
     item varchar(255) not null,
     createUserName varchar(255) not null,
     createData timestamp not null,
     modificationUserName varchar(255),
     modificationDate timestamp,
     status int(1) default 0,
     primary key (itemId)
)

create table tags(
    tagId int not null auto_increment,
    title varchar(32) not null,
    startDate timestamp not null,
    finishDate timestamp not null,
    createUserName varchar(255) not null,
    createData timestamp,
    modificationUserName varchar (255),
    modificationDate timestamp,
    status int(1) default 0,
    primary key (tagId)
)

create table tags_item(
    id int primary key not null auto_increment,
    tagId int not null,
    itemId int not null,
    foreign key (tagId) references tags (tagId),
    foreign key (itemId) references items (itemId)
)