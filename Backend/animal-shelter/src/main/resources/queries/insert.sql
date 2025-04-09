INSERT INTO species(name) values 
('Dog'),
('Cat');

INSERT INTO breed (id, type, species_id, created_on) VALUES
(1,'Labrador', 1,CURRENT_DATE),
(2,'Persian Cat',2, CURRENT_DATE),
(3,'Siberian Husky',1, CURRENT_DATE),
(4,'Maine Coon',2, CURRENT_DATE),
(5,'Golden Retriever',1, CURRENT_DATE);

-- Insert colors
INSERT INTO color (color, created_on) VALUES
('Black', CURRENT_DATE),
('White', CURRENT_DATE),
('Brown', CURRENT_DATE),
('Golden', CURRENT_DATE),
('Grey', CURRENT_DATE);


-- Insert animals
INSERT INTO animal (created_on, name, birth_date, sex, breed_id, background, description, color_id, disabilities)
VALUES
(CURRENT_DATE, 'Buddy', '2021-06-15',  'Male', 1, 'Rescue dog', 'Friendly and energetic', 1, FALSE),
(CURRENT_DATE, 'Misty', '2020-08-21',  'Female', 2, 'Adopted from shelter', 'Very affectionate', 2, FALSE),
(CURRENT_DATE, 'Shadow', '2019-03-10', 'Male', 3, 'Born in a farm', 'Loves the cold', 3, FALSE),
(CURRENT_DATE, 'Luna', '2018-12-05',  'Female', 4, 'Adopted', 'Independent but cuddly', 4, FALSE),
(CURRENT_DATE, 'Max', '2022-01-30',  'Male', 5, 'Rescue dog', 'Loves playing fetch', 5, FALSE),
(CURRENT_DATE, 'Cleo', '2021-09-12',  'Female', 2, 'Rescue cat', 'Shy but sweet', 1, FALSE),
(CURRENT_DATE, 'Charlie', '2017-04-25', 'Male', 1, 'Shelter dog', 'Very obedient', 3, FALSE),
(CURRENT_DATE, 'Whiskers', '2020-06-09', 'Male', 4, 'Born in a home', 'Playful and curious', 2, FALSE),
(CURRENT_DATE, 'Rocky', '2019-11-03',  'Male', 3, 'Rescue dog', 'Loyal and strong', 5, FALSE),
(CURRENT_DATE, 'Daisy', '2023-02-14',  'Female', 5, 'Adopted as a kitten', 'Loves to explore', 4, FALSE);


-- Insert animal images (Placeholder image data using decode for demonstration)
INSERT INTO animal_image (animal_id, name, image) VALUES
(1, 'buddy_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(1, 'buddy_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(2, 'misty_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(2, 'misty_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(3, 'shadow_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(3, 'shadow_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(4, 'luna_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(4, 'luna_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(5, 'max_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(5, 'max_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(6, 'cleo_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(6, 'cleo_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(7, 'charlie_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(7, 'charlie_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(8, 'whiskers_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(8, 'whiskers_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(9, 'rocky_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(9, 'rocky_2.jpg', decode('89504E470D0A1A0A', 'hex')),
(10, 'daisy_1.jpg', decode('89504E470D0A1A0A', 'hex')),
(10, 'daisy_2.jpg', decode('89504E470D0A1A0A', 'hex'));