CREATE TABLE t_material(
     CD_MATERIAL                  VARCHAR(30) NOT NULL PRIMARY KEY
    ,NM_BASICO                    VARCHAR(94) NOT NULL
    ,IN_IMPLANTACAO               VARCHAR(1) NOT NULL
    ,ST_VALIDADO                  VARCHAR(1) NOT NULL
    ,CD_SIGILO                    BIT  NOT NULL
    ,IN_CONJ_COMP                 VARCHAR(1) NOT NULL
    ,CD_CONTROLE_ITEM             VARCHAR(1) NOT NULL
    ,CD_CATEGORIA                 VARCHAR(1) NOT NULL
    ,CD_MEDIDA                    INTEGER  NOT NULL
    ,TP_MATERIAL                  VARCHAR(1) NOT NULL
    ,IN_ATIVO                     VARCHAR(1) NOT NULL
    ,DT_INSERT                    VARCHAR(19) NOT NULL
    ,NM_USER_INSERT               VARCHAR(14) NOT NULL
    ,DT_UPDATE                    VARCHAR(19) NOT NULL
    ,NM_USER_UPDATE               VARCHAR(14) NOT NULL
    ,NR_PN                        VARCHAR(28) NOT NULL
    ,CD_CONTABIL                  VARCHAR(1) NOT NULL
    ,CD_FORNECEDOR                VARCHAR(6) NOT NULL
    ,CD_ESPECIFICACAO_ASSUNTO     VARCHAR(30)
    ,NR_TEMPO_REMESSA             INTEGER  NOT NULL
    ,ST_EMBALAGEM                 VARCHAR(1)
    ,CD_FAIXA                     VARCHAR(1) NOT NULL
    ,CD_MOEDA                     INTEGER
    ,CD_UNIDADE_CATALOGA          VARCHAR(30)
    ,CD_SETOR                     VARCHAR(30)
    ,TP_MONITORACAO               VARCHAR(1)
    ,CD_ORG_PROVEDOR              VARCHAR(2) NOT NULL
    ,QT_GIRO                      VARCHAR(4)
    ,VL_LIMITE_ESTOCAGEM          INTEGER
    ,VL_VIDA_SERVICO              VARCHAR(30)
    ,CD_UNIDADE                   INTEGER  NOT NULL
    ,DT_ULTIMA_COMPRA             VARCHAR(15)
    ,CD_ITEM                      INTEGER  NOT NULL
    ,CD_CLASSE                    INTEGER  NOT NULL
    ,IN_HARMONIZA                 VARCHAR(1)
    ,ID_DIRETORIA                 VARCHAR(1)
    ,CD_CRITICIDADE               VARCHAR(30)
    ,QT_LOTE_MINIMO               VARCHAR(4)
    ,IN_INSPECAO_OBRIGATORIA      VARCHAR(1)
    ,TP_SISTEMA                   VARCHAR(1)
    ,IN_FICHA_HISTORICO           VARCHAR(1)
    ,ST_IDENTIFICADOR             VARCHAR(1)
    ,ST_RESPONSABILIDADE          BIT
    ,CD_NSCM                      VARCHAR(30)
    ,PESO                         VARCHAR(30)
    ,CUBAGEM                      VARCHAR(30)
    ,CD_TIPO                      INTEGER  NOT NULL
    ,DT_IMPLANTACAO               VARCHAR(19) NOT NULL
    ,CD_UNIDADE_DELINEA           VARCHAR(30)
    ,DT_DELINEAMENTO              VARCHAR(30)
    ,NR_FRG                       INTEGER
    ,NR_TRG                       VARCHAR(30)
    ,CD_DESENHO                   VARCHAR(30)
    ,CD_INVENTARIO                BIT
    ,TX_OBSERVACAO                VARCHAR(35)
    ,IN_AEROELETRONICA            VARCHAR(1) NOT NULL
    ,NR_GRUPO                     VARCHAR(30)
    ,VL_TAMANHO                   VARCHAR(30)
    ,QT_TECIDO                    VARCHAR(30)
    ,PC_UTILIZ_FAM                VARCHAR(30)
    ,IN_VOLUME                    VARCHAR(1)
    ,QT_VOLUME_PADRAO             VARCHAR(4)
    ,QT_DISTRIB_PADRAO            VARCHAR(4)
    ,QT_DISTRIB_LIMITE            VARCHAR(30)
    ,QT_PRAZO_LIMITE              VARCHAR(30)
    ,ID_CLASSE_EXPLOSIVO          VARCHAR(30)
    ,ID_GRUPO_COMPATIBILIDADE     VARCHAR(30)
    ,ID_GRUPO_INTERESSE           VARCHAR(30)
    ,IN_USO_PROIBIDO              VARCHAR(30)
    ,QT_LIQUIDA_EXPLOSIVO         VARCHAR(30)
    ,CD_APLICACAO_BELICA          VARCHAR(30)
    ,IN_MATERIAL_BELICO           VARCHAR(1) NOT NULL
    ,IN_LHA_ELETRONICO            VARCHAR(1) NOT NULL
    ,IN_NACIONALIZADO             VARCHAR(1)
    ,CD_MEDIDA_COMPL              VARCHAR(30)
    ,VL_CAP_MED                   VARCHAR(30)
    ,IN_EXIGE_INSP_VOO            VARCHAR(1)
    ,NR_DIAS_EXIGE_INSP_VOO       VARCHAR(30)
    ,IN_APARECE_MAPA              VARCHAR(1)
    ,IN_DURADOURO                 VARCHAR(1)
    ,IN_MANUFATURADO              VARCHAR(1)
    ,ID_SUBCLASSE_EXPLOSIVO       VARCHAR(30)
    ,IN_NECESSITA_EMBALAGEM_ESPEC VARCHAR(1)
    ,CD_CLASSE_GRAND_INSTRUMENTO  VARCHAR(30)
    ,VL_FATOR_CORRECAO_SISUB      VARCHAR(30)
    ,IN_RACAO_SISUB               VARCHAR(1) NOT NULL
    ,IN_END_USER                  VARCHAR(1) NOT NULL
);