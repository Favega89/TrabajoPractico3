create database DBTP3;

use DBTP3;

create table RESULTADOS(
	id int auto_increment primary key not null,
    nombre_ganador varchar(50) not null,
    puntaje int not null
);


use DBTP3;

select * from RESULTADOS;

use DBTP3;
drop table resultados;