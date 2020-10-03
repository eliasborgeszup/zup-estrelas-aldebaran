UPDATE banco_estrelas.cidade 
SET renda_per_capita = 19.922
WHERE cep = "38720000";

UPDATE banco_estrelas.cidade 
SET renda_per_capita = 642.512
WHERE cep = "38730000";

UPDATE banco_estrelas.estado 
SET regiao = 'Sudeste'
WHERE sigla = 'MG';

UPDATE banco_estrelas.estado 
SET regiao = 'Sul'
WHERE sigla = 'PR';


UPDATE banco_estrelas.estado 
SET sigla = 'CE'
WHERE sigla = 'CA';

UPDATE banco_estrelas.estado 
SET sigla = 'MA'
WHERE sigla = 'ME';

UPDATE banco_estrelas.cidade 
SET capital = true
WHERE cep IN ("32310000");

UPDATE banco_estrelas.cidade 
SET capital = true
WHERE cep IN ("33210000", "38390132"); 

UPDATE banco_estrelas.cidade 
SET capital = true
WHERE cep IN ("33220000", "33230000", "33250000", "33260000", 
"33270000", "33280000", "33290000", "38110000", "38120235",
"38131000", "38232000", "38233000", "38310000", "38320000",
"38330000", "38340231", "38340232", "38340233", "38340234",
"38350236", "38360237", "38370131", "38380631", "38390132",
"38740000");