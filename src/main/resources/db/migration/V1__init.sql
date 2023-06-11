create table payments(
    id bigint primary key not null,
    amount bigint not null,
    description varchar(255),
    pay_date timestamp not null default current_timestamp;
);

insert into payments (amount, description) values
(250, "sklavenitis"),
(70, "masoutis");
