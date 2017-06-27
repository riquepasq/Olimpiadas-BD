INSERT INTO NACAO(NroNacao,Nome,Continente,Esporte,Hino)
    VALUES (1, 'Brasil', 'America do Sul', 'Futebol',
'Ouviram do Ipiranga as margens pl�cidas
De um povo heroico o brado retumbante
E o sol da liberdade, em raios f�lgidos
Brilhou no c�u da p�tria nesse instante
Se o penhor dessa igualdade
Conseguimos conquistar com bra�o forte
Em teu seio, � liberdade
Desafia o nosso peito a pr�pria morte!
� p�tria amada
Idolatrada
Salve! Salve!
Brasil, um sonho intenso, um raio v�vido
De amor e de esperan�a � terra desce
Se em teu formoso c�u, risonho e l�mpido
A imagem do cruzeiro resplandece
Gigante pela pr�pria natureza
�s belo, �s forte, imp�vido colosso
E o teu futuro espelha essa grandeza
Terra adorada
Entre outras mil
�s tu, Brasil
� p�tria amada!
Dos filhos deste solo �s m�e gentil
P�tria amada
Brasil!
Deitado eternamente em ber�o espl�ndido
Ao som do mar e � luz do c�u profundo
Fulguras, � Brasil, flor�o da Am�rica
Iluminado ao sol do novo mundo!

Do que a terra mais garrida
Teus risonhos, lindos campos t�m mais flores
"Nossos bosques t�m mais vida"
"Nossa vida" no teu seio "mais amores"

� p�tria amada
Idolatrada
Salve! Salve!

Brasil, de amor eterno seja s�mbolo
O l�baro que ostentas estrelado
E diga o verde-louro dessa fl�mula
Paz no futuro e gl�ria no passado

Mas, se ergues da justi�a a clava forte
Ver�s que um filho teu n�o foge � luta
Nem teme, quem te adora, a pr�pria morte

Terra adorada
Entre outras mil
�s tu, Brasil
� p�tria amada!

Dos filhos deste solo �s m�e gentil
P�tria amada
Brasil!');
INSERT INTO NACAO(NroNacao,Nome,Continente,Esporte,Hino)
    VALUES (2, 'Estados Unidos', 'America do Norte', 'Futebol americano', 
'Oh, say! can you see by the dawns early light
What so proudly we hailed at the twilights last gleaming
Whose broad stripes and bright stars, through the perilous fight,
O er the ramparts we watched were so gallantly streaming?
And the rocket s red glare, the bombs bursting in air,
Gave proof through the night that our flag was still there:
Oh, say! does that star-spangled banner yet wave
O er the land of the free and the home of the brave?

On the shore, dimly seen through the mists of the deep,
Where the foe s haughty host in dread silence reposes,
What is that which the breeze, o er the towering steep,
As it fitfully blows, half conceals, half discloses?
Now it catches the gleam of the morning s first beam,
In fully glory reflected now shines in the stream:
Tis the star-spangled banner! Oh, long may it wave
O er the land of the free and the home of the brave!

And where is that band who so vauntingly swore
That the havoc of war and the battle s confusion
A home and a country should leave us no more?
Their blood has washed out their foul footsteps pollution!
No refuge could save the hireling and slave
From the terror of flight or the gloom of the grave:
And the star-spangled banner in triumph doth wave
O er the land of the free and the home of the brave.

Oh, thus be it ever, when freemen shall stand
Between their loved home and the war s desolation!
Blest with victory and peace, may the heav n-rescued land
Praise the Power that hath made and preserved us a nation!
Then conquer we must, when our cause it is just,
And this be our motto: "In God is our trust":
And the star-spangled banner in triumph shall wave
O er the land of the free and the home of the brave.');
INSERT INTO NACAO(NroNacao,Nome,Continente,Esporte,Hino)
    VALUES (3, 'Canada', 'America do Norte', 'Hoquei', 
'O Canada!
Our home and native land!
True patriot love in all thy sons command.

With glowing hearts we see thee rise,
The True North strong and free!

From far and wide,
O Canada, we stand on guard for thee.

God keep our land glorious and free!
O Canada, we stand on guard for thee.
O Canada, we stand on guard for thee.');

INSERT INTO MODALIDADE(NroModalidade,Nome,Descricao)
    VALUES (1, 'Natacao', 'A nata��o � um dos esportes mais tradicionais dos Jogos Ol�mpicos, disputado em todas as edi��es. A partir dos Jogos de 1912 foi aberto para as mulheres. Depois do atletismo, a nata��o � o esporte que distribui o maior n�mero de medalhas.');
INSERT INTO MODALIDADE(NroModalidade,Nome,Descricao)
    VALUES (2, 'Futebol Masculino', 'O torneio masculino � a �nica modalidade ol�mpica a "restringir" a participa��o de atletas. Isso porque a FIFA teme que o torneio ol�mpico de futebol possa competir em import�ncia com a Copa do Mundo. Por outro lado, o Comit� Ol�mpico Internacional tem receio que as outras competi��es entrem em car�ter secund�rio para a m�dia, ofuscadas pelas grandes estrelas dos gramados.[carece de fontes] Por conta dessa "restri��o", o torneio masculino � a competi��o de futebol mais imprevis�vel, com medalhas conquistadas por pa�ses como Jap�o (bronze em 1968), Gana (bronze em 1992), Nig�ria (ouro em 1996, prata em 2008 e bronze em 2016), Camar�es (ouro em 2000), Chile (bronze em 2000) e Coreia do Sul (bronze em 2012).');
INSERT INTO MODALIDADE(NroModalidade,Nome,Descricao)
    VALUES (3, 'Futebol Feminino', 'A partir de 1996, o futebol feminino tamb�m � disputado, com domin�ncia dos Estados Unidos da Am�rica, que esteve presente em todas as finais at� 2012 e s� n�o levou o ouro em 2000, perdendo para a Noruega. Na edi��o de 2016, pela primeira vez, as norte-americanas n�o disputaram medalhas. Elas foram superadas pela Su�cia nas quartas de final, na disputa de penalidades. Com a sele��o americana eliminada, e a Noruega fora do torneio, a Alemanha se sagrou a terceira campe� do torneio. Desde que o torneio feminino foi inclu�do no programa ol�mpico, nunca houve uma dobradinha - ou seja, o mesmo pa�s conquistar a medalha de ouro tanto no masculino quanto no feminino. O pa�s que chegou mais perto foi a Alemanha, que em 2016 conquistou o ouro no feminino e a prata no masculino.');
 
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (1, 'Marta Vieira da Silva', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (2, 'Franklyn Galen', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (3, 'Kirk Zackary', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (4, 'Samir Salim Daher', 'medico');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (5, 'Winslow Braith', 'medico');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (6, 'Erskine Brenton', 'medico');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (7, 'Eduardo Oliveira', 'preparador');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (8, 'Jameson Joel', 'preparador');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (9, 'Jerrard Truman', 'preparador');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (10, 'Joana da Silva', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (11, 'Jorge Hayford', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (12, 'James Brand', 'preparador');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (13, 'Garry Bayers', 'atleta');

INSERT INTO TELEFONES (CodigoPar, Numero) VALUES (4, 992561256);
INSERT INTO TELEFONES (CodigoPar, Numero) VALUES (4, 35615126);
INSERT INTO TELEFONES (CodigoPar, Numero) VALUES (8, 33351367);

INSERT INTO MEDICO (NroMedico, CRM, Endereco)
    VALUES (4, 5523, 'Avenida S�vio Gama');
INSERT INTO MEDICO (NroMedico, CRM, Endereco)
    VALUES (5, 13783, 'Grandview Highway');
INSERT INTO MEDICO (NroMedico, CRM, Endereco)
    VALUES (6, 8382, 'Seymour Street');

INSERT INTO PREPARADOR (NroPreparador, Email, Senha, Cidade, Estado, Nacao, Data_Nasc, Sexo, TipoIdent, CPF)
    VALUES (7, 'eduardool@gmail.com', 'edu123', 'Sao Paulo', 'Sao Paulo', 1, TO_DATE('1996/10/11', 'yyyy/mm/dd'), 'masculino', 'bra', '3737528442');
INSERT INTO PREPARADOR (NroPreparador, Email, Senha, Cidade, Estado, Nacao, Data_Nasc, Sexo, TipoIdent, Passaporte)
    VALUES (8, 'jamesonjoel@gmail.com', 'jmson$31%j!', 'Pittsburgh', 'Pensilvania', 2, TO_DATE('1992/06/06', 'yyyy/mm/dd'), 'masculino', 'est', '6A8R8Y45'); 
INSERT INTO PREPARADOR (NroPreparador, Email, Senha, Cidade, Estado, Nacao, Data_Nasc, Sexo, TipoIdent, Passaporte)
    VALUES (9, 'jerrjarr@gmail.com', 'jjrr199509', 'Vancouver', 'Columbia Britanica', 3, TO_DATE('1995/09/25', 'yyyy/mm/dd'), 'masculino', 'est', '12AH65Y9');
INSERT INTO PREPARADOR (NroPreparador, Email, Senha, Cidade, Estado, Nacao, Data_Nasc, Sexo, TipoIdent, Passaporte)
    VALUES (12, 'jamsbran@gmail.com', 'jb123', 'Toronto', 'Ontario', 3, TO_DATE('1994/02/21', 'yyyy/mm/dd'), 'masculino', 'est', '15265Y9');
    
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (1, 'regular', '38A1526T', 'feminino', 65.2, 1.60, TO_DATE('1989/07/09', 'yyyy/mm/dd'), 7, 1, 3);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (2, 'recuperado', '72R2Z6A69', 'masculino', 83.2, 1.89, TO_DATE('1990/03/23', 'yyyy/mm/dd'), 8, 2, 2);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (3, 'suspenso', '98H23K761', 'masculino', 74.6, 1.81, TO_DATE('1995/11/30', 'yyyy/mm/dd'), 9, 3, 1);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (10, 'suspenso', '88N23Q762', 'feminino', 65.0, 1.70, TO_DATE('1992/01/22', 'yyyy/mm/dd'), 7, 1, 3);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (11, 'regular', '18N23Q752', 'masculino', 75.0, 1.80, TO_DATE('1993/02/12', 'yyyy/mm/dd'), 8, 2, 2);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (13, 'regular', '52N23Q721', 'masculino', 76.1, 1.82, TO_DATE('1994/02/12', 'yyyy/mm/dd'), 12, 3, 2);

INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (1, 7, 'Segunda', 20, 'Agachamento com eleva��o, levantamento terra romano de uma perna com haltere', 1);
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (4, 7, 'Segunda', 20, 'Agachamento com eleva��o, levantamento terra romano de uma perna com haltere', 10);    
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (2, 8, 'Quarta', 30, 'Extens�o de tr�ceps com barra sentado, flex�o de bra�os nas barras paralelas', 2);
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (5, 8, 'Quarta', 30, 'Extens�o de tr�ceps com barra sentado, flex�o de bra�os nas barras paralelas', 11);
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (3, 9, 'Quinta', 15, 'Agachamento com eleva��o, levantamento terra romano de uma perna com haltere', 3);
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (6, 12, 'Sexta', 30, 'Agachamento com eleva��o, levantamento terra romano de uma perna com haltere', 13);

INSERT INTO PREPARO (NroPreparo, Rotina, Descricao)
    VALUES (1, 1, 'Treinar com s�ries de corrida e caminhada intercaladas permitindo uma maior percep��o do esfor�o f�sico e um tempo para recuperar o f�lego.');
INSERT INTO PREPARO (NroPreparo, Rotina, Descricao)
    VALUES (2, 2, 'Fazer a respira��o marcada por passos, ou seja, a cada tr�s passos inspirando, fa�a os mesmos tr�s passos expirando, at� que isso seja feito naturalmente.');
INSERT INTO PREPARO (NroPreparo, Rotina, Descricao)
    VALUES (3, 3, 'Treinar no ritmo ideal, com frequ�ncias card�acas baixas, de modo que todas as fun��es do organismo entrem em equil�brio.');

INSERT INTO RECUPERACAO (NroRecuperacao, Rotina, Descricao)
    VALUES (1, 1, 'Cinesioterapia - Terapia pelo movimento. S�o procedimentos onde se usa o movimento com os m�sculos, articula��es, ligamentos, tend�es e estruturas do sistema nervoso central e perif�rico, que t�m como objetivo recuperar a fun��o dos mesmos.');
INSERT INTO RECUPERACAO (NroRecuperacao, Rotina, Descricao)
    VALUES (2, 2, 'Eletroterapia - Recurso que utiliza a eletricidade em in�meros tratamentos e estimula��o, como o TENS e o FES.');
INSERT INTO RECUPERACAO (NroRecuperacao, Rotina, Descricao)
    VALUES (3, 3, 'Mecanoterapia - Procedimento com aparelhos mec�nicos para fortalecer, alongar, repotencializar a musculatura e reeducar movimentos comprometidos.');

INSERT INTO LESAO (NroLesao, Descricao) VALUES (1, 'Distens�o muscular');
INSERT INTO LESAO (NroLesao, Descricao) VALUES (2, 'Estiramento');
INSERT INTO LESAO (NroLesao, Descricao) VALUES (3, 'Luxa��o');

INSERT INTO ATENDIMENTO_LESAO(Atleta, Lesao, Medico) VALUES (1, 1, 4);
INSERT INTO ATENDIMENTO_LESAO(Atleta, Lesao, Medico) VALUES (2, 2, 5);
INSERT INTO ATENDIMENTO_LESAO(Atleta, Lesao, Medico) VALUES (3, 3, 6);

INSERT INTO ATENDIMENTO_DOPING(NroDoping, Atleta, Medico, Data, Resultados)
    VALUES (1, 1, 4, TO_DATE('2017/04/03', 'yyyy/mm/dd'), 'Nenhuma irregularidade encontrada');
INSERT INTO ATENDIMENTO_DOPING(NroDoping, Atleta, Medico, Data, Resultados)
    VALUES (2, 2, 5, TO_DATE('2017/06/14', 'yyyy/mm/dd'), 'Nenhuma irregularidade encontrada');
INSERT INTO ATENDIMENTO_DOPING(NroDoping, Atleta, Medico, Data, Resultados)
    VALUES (3, 3, 6, TO_DATE('2017/05/11', 'yyyy/mm/dd'), 'Nenhuma irregularidade encontrada');

INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (1, 1, 4, TO_DATE('2017/05/12', 'yyyy/mm/dd'));
INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (2, 2, 5, TO_DATE('2016/12/23', 'yyyy/mm/dd'));
INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (3, 3, 6, TO_DATE('2017/04/01', 'yyyy/mm/dd'));
INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (4, 2, 4, TO_DATE('2017/04/02', 'yyyy/mm/dd'));
INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (5, 3, 4, TO_DATE('2017/04/03', 'yyyy/mm/dd'));
INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (6, 2, 4, TO_DATE('2016/12/22', 'yyyy/mm/dd'));
INSERT INTO ATENDIMENTO_CONSULTA(NroConsulta, Atleta, Medico, Data)
    VALUES (7, 2, 6, TO_DATE('2016/12/24', 'yyyy/mm/dd'));    
    
INSERT INTO SINTOMAS (CodConsulta, Sintoma)
    VALUES (1, 'Coceira intensa e ardor, falta de ar e dificuldade para engolir e falar');
INSERT INTO SINTOMAS (CodConsulta, Sintoma)
    VALUES (2, 'Dor de cabe�a e garganta, manchas pelo corpo: exantema m�culo-papular (vermelhid�o em forma de pequenas manchas e p�pulas), confus�o mental, convuls�es;');
INSERT INTO SINTOMAS (CodConsulta, Sintoma)
    VALUES (3, 'Crises de dor de cabe�a, n�usea e v�mito');
           
INSERT INTO DIAGNOSTICO (NroDiag, Consulta, Descricao)
    VALUES (1, 1, 'Caso de urticaria');
INSERT INTO DIAGNOSTICO (NroDiag, Consulta, Descricao)
    VALUES (2, 2, 'Poss�vel toxoplasmose, com complica��es em rela��o ao uso de drogas');
INSERT INTO DIAGNOSTICO (NroDiag, Consulta, Descricao)
    VALUES (3, 3, 'Caso de enxaqueca');
    
INSERT INTO METODO (NroMetodo, Diagnostico, Descricao, Efetividade)
    VALUES (1, 1, 'Medicamentos anti-histam�nicos (conhecidos como antial�rgicos), por via oral', '�teis para aliviar os sintomas, porque inibem a a��o dos receptores de histamina.');
INSERT INTO METODO (NroMetodo, Diagnostico, Descricao, Efetividade)
    VALUES (2, 2, 'Pirimetamina (usado tamb�m contra a mal�ria) associado a um antibi�tico e ao �cido f�lico', 'Impedem a multiplica��o do protozo�rio nas formas mais agressivas da doen�a.');
INSERT INTO METODO (NroMetodo, Diagnostico, Descricao, Efetividade)
    VALUES (3, 3, 'Uso de sumatriptana', 'Droga que reverte a dilata��o dos vasos e diminui a transmiss�o da dor, e de naproxeno, que diminui a inflama��o.');

COMMIT;