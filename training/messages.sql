
use slktraining;

drop table if exists messages;
create table messages(

id int primary key auto_increment,
msg_to varchar(255) not null,
cc varchar(255),
subject varchar(255) not null,
msg_body TEXT,
sent_at datetime
 );