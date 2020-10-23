insert into "User" (login, password)
values ('dany', '12345'),
       ('ivan', 'h1234'),
       ('misha', 'qwerty'),
       ('dima', '12mint'),
       ('asmall', '123456'),
       ('sasha', '4567a');


insert into "Chatroom" (chatroom_name, chatroom_ower)
values ('name', 'dany'),
       ('friend', 'fear'),
       ('gave', 'dany'),
       ('chat', 'asmall'),
       ('first', 'mint'),
       ('exam', 'dima');

insert into "Message" (message_author, message_text, message_date_time)
values ('asmall', 'hello my friend', '21/03/20 16:53'),
       ('dany', 'hello', '22/06/20 14:23'),
       ('asmall', 'how are you', '15/07/20 15:45'),
       ('dima', 'hello, my dear', '16/07/20 19:45'),
       ('misha', 'hi', '16/08/20 20:43');
