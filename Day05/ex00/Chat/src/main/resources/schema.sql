create table "User"
(
    user_ID serial primary key,
    login text not null,
    password text not null,
    list_of_created_rooms text[],
    list_of_chatrooms_where_a_user_socializes text[]
);

create table "Chatroom"
(
    chatroom_ID serial primary key,
    chatroom_name text not null,
    chatroom_ower text not null,
    list_of_messages_in_a_chatroom text[],
    foreign key (chatroom_ID) references "User" (user_ID)
);

create table "Message"
(
    message_ID serial primary key,
    message_author text not null,
    message_text text not null,
    message_date_time text not null,
    foreign key (message_ID) references "User" (user_ID)
);