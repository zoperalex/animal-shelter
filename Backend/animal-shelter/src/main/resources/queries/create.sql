drop table animal_image;
drop table breed ;
drop table color ;
drop table animal ;

CREATE TABLE "breed" (
    "id" INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT null,
    "type" varchar NOT null,
    "created_on" date NOT NULL
);

CREATE TABLE "color" (
    "id" INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT null,
    "color" varchar NOT NULL,
    "created_on" date NOT NULL
);

CREATE TABLE "animal" (
  "id" INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  "created_on" date,
  "name" varchar,
  "DoB" date NOT NULL,
  "species" varchar NOT NULL,
  "sex" varchar NOT NULL,
  "breed_id" INTEGER,
  "background" varchar,
  "description" varchar NOT NULL,
  "color_id" INTEGER,
  "disabilities" boolean,
  CONSTRAINT fk_breed FOREIGN KEY ("breed_id") REFERENCES breed(id),
  CONSTRAINT fk_color FOREIGN KEY ("color_id") REFERENCES color(id)
);

CREATE TABLE "animal_image" (
  "id" INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  "animal_id" integer NOT NULL,
  "name" varchar NOT NULL,
  "image" bytea NOT null,
  CONSTRAINT fk_animal FOREIGN KEY ("animal_id") REFERENCES animal(id)
);