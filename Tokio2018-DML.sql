INSERT INTO NACAO(NroNacao,Nome,Continente,Esporte,Hino)
    VALUES (1, 'Brasil', 'America do Sul', 'Futebol',
'Ouviram do Ipiranga as margens plácidas
De um povo heroico o brado retumbante
E o sol da liberdade, em raios fúlgidos
Brilhou no céu da pátria nesse instante
Se o penhor dessa igualdade
Conseguimos conquistar com braço forte
Em teu seio, ó liberdade
Desafia o nosso peito a própria morte!
Ó pátria amada
Idolatrada
Salve! Salve!
Brasil, um sonho intenso, um raio vívido
De amor e de esperança à terra desce
Se em teu formoso céu, risonho e límpido
A imagem do cruzeiro resplandece
Gigante pela própria natureza
És belo, és forte, impávido colosso
E o teu futuro espelha essa grandeza
Terra adorada
Entre outras mil
És tu, Brasil
Ó pátria amada!
Dos filhos deste solo és mãe gentil
Pátria amada
Brasil!
Deitado eternamente em berço esplêndido
Ao som do mar e à luz do céu profundo
Fulguras, ó Brasil, florão da América
Iluminado ao sol do novo mundo!

Do que a terra mais garrida
Teus risonhos, lindos campos têm mais flores
"Nossos bosques têm mais vida"
"Nossa vida" no teu seio "mais amores"

Ó pátria amada
Idolatrada
Salve! Salve!

Brasil, de amor eterno seja símbolo
O lábaro que ostentas estrelado
E diga o verde-louro dessa flâmula
Paz no futuro e glória no passado

Mas, se ergues da justiça a clava forte
Verás que um filho teu não foge à luta
Nem teme, quem te adora, a própria morte

Terra adorada
Entre outras mil
És tu, Brasil
Ó pátria amada!

Dos filhos deste solo és mãe gentil
Pátria amada
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
    VALUES (1, 'Natacao', 'A natação é um dos esportes mais tradicionais dos Jogos Olímpicos, disputado em todas as edições. A partir dos Jogos de 1912 foi aberto para as mulheres. Depois do atletismo, a natação é o esporte que distribui o maior número de medalhas.');
INSERT INTO MODALIDADE(NroModalidade,Nome,Descricao)
    VALUES (2, 'Futebol Masculino', 'O torneio masculino é a única modalidade olímpica a "restringir" a participação de atletas. Isso porque a FIFA teme que o torneio olímpico de futebol possa competir em importância com a Copa do Mundo. Por outro lado, o Comitê Olímpico Internacional tem receio que as outras competições entrem em caráter secundário para a mídia, ofuscadas pelas grandes estrelas dos gramados.[carece de fontes] Por conta dessa "restrição", o torneio masculino é a competição de futebol mais imprevisível, com medalhas conquistadas por países como Japão (bronze em 1968), Gana (bronze em 1992), Nigéria (ouro em 1996, prata em 2008 e bronze em 2016), Camarões (ouro em 2000), Chile (bronze em 2000) e Coreia do Sul (bronze em 2012).');
INSERT INTO MODALIDADE(NroModalidade,Nome,Descricao)
    VALUES (3, 'Futebol Feminino', 'A partir de 1996, o futebol feminino também é disputado, com dominância dos Estados Unidos da América, que esteve presente em todas as finais até 2012 e só não levou o ouro em 2000, perdendo para a Noruega. Na edição de 2016, pela primeira vez, as norte-americanas não disputaram medalhas. Elas foram superadas pela Suécia nas quartas de final, na disputa de penalidades. Com a seleção americana eliminada, e a Noruega fora do torneio, a Alemanha se sagrou a terceira campeã do torneio. Desde que o torneio feminino foi incluído no programa olímpico, nunca houve uma dobradinha - ou seja, o mesmo país conquistar a medalha de ouro tanto no masculino quanto no feminino. O país que chegou mais perto foi a Alemanha, que em 2016 conquistou o ouro no feminino e a prata no masculino.');
 
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (1, 'Marta Vieira da Silva', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (2, 'Franklyn Galen', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (3, 'Kirk Zackary', 'atleta');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (4, 'Samir Salim Daher', 'medico');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (5, 'Winslow Braith', 'medico');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (6, 'Erskine Brenton', 'medico');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (7, 'Eduardo Oliveira', 'preparador');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (8, 'Jameson Joel', 'preparador');
INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES (9, 'Jerrard Truman', 'preparador');

INSERT INTO TELEFONES (CodigoPar, Numero) VALUES (4, 992561256);
INSERT INTO TELEFONES (CodigoPar, Numero) VALUES (4, 35615126);
INSERT INTO TELEFONES (CodigoPar, Numero) VALUES (8, 33351367);

INSERT INTO MEDICO (NroMedico, CRM, Endereco)
    VALUES (4, 5523, 'Avenida Sávio Gama');
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
    
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (1, 'regular', '38A1526T', 'feminino', 65.2, 1.60, TO_DATE('1989/07/09', 'yyyy/mm/dd'), 7, 1, 3);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (2, 'recuperado', '72R2Z6A69', 'masculino', 83.2, 1.89, TO_DATE('1990/03/23', 'yyyy/mm/dd'), 8, 2, 2);
INSERT INTO ATLETA (NroAtleta, Situacao, Passaporte, Sexo, Peso, Altura, Data_Nasc, Preparador, Nacao, Modalidade)
    VALUES (3, 'suspenso', '98H23K761', 'masculino', 74.6, 1.81, TO_DATE('1995/11/30', 'yyyy/mm/dd'), 9, 3, 1);

INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (1, 7, 'Segunda', 20, 'Agachamento com elevação, levantamento terra romano de uma perna com haltere', 1);
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (2, 8, 'Quarta', 30, 'Extensão de tríceps com barra sentado, flexão de braços nas barras paralelas', 2);
INSERT INTO ROTINA (NroRotina, Preparador, DiaSemana, Repeticao, Descricao, Atleta)
    VALUES (3, 9, 'Quarta', 15, 'Agachamento com elevação, levantamento terra romano de uma perna com haltere', 3);

INSERT INTO PREPARO (NroPreparo, Rotina, Descricao)
    VALUES (1, 1, 'Treinar com séries de corrida e caminhada intercaladas permitindo uma maior percepção do esforço físico e um tempo para recuperar o fôlego.');
INSERT INTO PREPARO (NroPreparo, Rotina, Descricao)
    VALUES (2, 2, 'Fazer a respiração marcada por passos, ou seja, a cada três passos inspirando, faça os mesmos três passos expirando, até que isso seja feito naturalmente.');
INSERT INTO PREPARO (NroPreparo, Rotina, Descricao)
    VALUES (3, 3, 'Treinar no ritmo ideal, com frequências cardíacas baixas, de modo que todas as funções do organismo entrem em equilíbrio.');

INSERT INTO RECUPERACAO (NroRecuperacao, Rotina, Descricao)
    VALUES (1, 1, 'Cinesioterapia - Terapia pelo movimento. São procedimentos onde se usa o movimento com os músculos, articulações, ligamentos, tendões e estruturas do sistema nervoso central e periférico, que têm como objetivo recuperar a função dos mesmos.');
INSERT INTO RECUPERACAO (NroRecuperacao, Rotina, Descricao)
    VALUES (2, 2, 'Eletroterapia - Recurso que utiliza a eletricidade em inúmeros tratamentos e estimulação, como o TENS e o FES.');
INSERT INTO RECUPERACAO (NroRecuperacao, Rotina, Descricao)
    VALUES (3, 3, 'Mecanoterapia - Procedimento com aparelhos mecânicos para fortalecer, alongar, repotencializar a musculatura e reeducar movimentos comprometidos.');

INSERT INTO LESAO (NroLesao, Descricao) VALUES (1, 'Distensão muscular');
INSERT INTO LESAO (NroLesao, Descricao) VALUES (2, 'Estiramento');
INSERT INTO LESAO (NroLesao, Descricao) VALUES (3, 'Luxação');

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
    
INSERT INTO SINTOMAS (CodConsulta, Sintoma)
    VALUES (1, 'Coceira intensa e ardor, falta de ar e dificuldade para engolir e falar');
INSERT INTO SINTOMAS (CodConsulta, Sintoma)
    VALUES (2, 'Dor de cabeça e garganta, manchas pelo corpo: exantema máculo-papular (vermelhidão em forma de pequenas manchas e pápulas), confusão mental, convulsões;');
INSERT INTO SINTOMAS (CodConsulta, Sintoma)
    VALUES (3, 'Crises de dor de cabeça, náusea e vômito');
           
INSERT INTO DIAGNOSTICO (NroDiag, Consulta, Descricao)
    VALUES (1, 1, 'Caso de urticaria');
INSERT INTO DIAGNOSTICO (NroDiag, Consulta, Descricao)
    VALUES (2, 2, 'Possível toxoplasmose, com complicações em relação ao uso de drogas');
INSERT INTO DIAGNOSTICO (NroDiag, Consulta, Descricao)
    VALUES (3, 3, 'Caso de enxaqueca');
    
INSERT INTO METODO (NroMetodo, Diagnostico, Descricao, Efetividade)
    VALUES (1, 1, 'Medicamentos anti-histamínicos (conhecidos como antialérgicos), por via oral', 'Úteis para aliviar os sintomas, porque inibem a ação dos receptores de histamina.');
INSERT INTO METODO (NroMetodo, Diagnostico, Descricao, Efetividade)
    VALUES (2, 2, 'Pirimetamina (usado também contra a malária) associado a um antibiótico e ao ácido fólico', 'Impedem a multiplicação do protozoário nas formas mais agressivas da doença.');
INSERT INTO METODO (NroMetodo, Diagnostico, Descricao, Efetividade)
    VALUES (3, 3, 'Uso de sumatriptana', 'Droga que reverte a dilatação dos vasos e diminui a transmissão da dor, e de naproxeno, que diminui a inflamação.');

COMMIT;