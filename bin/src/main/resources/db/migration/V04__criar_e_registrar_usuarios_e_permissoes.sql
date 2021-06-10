  create table permissao (
       codigo int8 not null,
        descricao varchar(255),
        primary key (codigo)
    );
    
    create table usuario (
       codigo int8 not null,
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        primary key (codigo)
    );
    
    create table usuario_permissao (
       codigo_usuario int8 not null,
        codigo_permissao int8 not null
    );
   
    alter table if exists unique_usuario_permissao 
       add constraint usuario_permissao unique (codigo_usuario, codigo_permissao);

    
    alter table if exists usuario_permissao 
       add constraint codigo_permissao 
       foreign key (codigo_permissao) 
       references permissao;
    
    alter table if exists usuario_permissao 
       add constraint codigo_usuario 
       foreign key (codigo_usuario) 
       references usuario;