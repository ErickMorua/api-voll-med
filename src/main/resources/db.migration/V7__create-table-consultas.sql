create table consultas(

    id bigint not null auto_increment,
    medico_id bigint not null,
    paciente_id bigint not null,
    data datatime not null,

    primary key(id),

    constraint fk_consultas_medico_id foreign key(medico_id) references medicos(id),
    constraint kj_consultas_paceinte_id foreign key(paciente_id) references pacientes(id)
    );