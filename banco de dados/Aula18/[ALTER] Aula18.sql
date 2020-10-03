ALTER TABLE banco_estrelas.cidade
ADD CONSTRAINT estado_fk
FOREIGN KEY (estado)
REFERENCES banco_estrelas.estado (sigla)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE banco_estrelas.estado 
ADD COLUMN regiao VARCHAR(15) NOT NULL AFTER nome;

ALTER TABLE banco_estrelas.estado MODIFY COLUMN regiao TEXT;  