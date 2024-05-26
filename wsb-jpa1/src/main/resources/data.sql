insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');



-- Tabela Address
INSERT INTO Address (ID, ADDRESS_LINE1 , ADDRESS_LINE2 , CITY,  POSTAL_CODE ) VALUES
(11, 'ul. Kowalska 1', 'Mieszkanie 10', 'Wrocław', '50-001'),
(2, 'ul. Nowakowska 2', 'Mieszkanie 20', 'Warszawa', '00-001'),
(3, 'ul. Zielinskiego 3', 'Mieszkanie 30', 'Kraków', '30-001'),
(4, 'ul. Malinowska 4', 'Mieszkanie 40', 'Poznań', '60-001'),
(5, 'ul. Jankowska 5', 'Mieszkanie 50', 'Gdańsk', '80-001'),
(6, 'ul. Sienkiewicza 6', 'Mieszkanie 60', 'Łódź', '90-001'),
(7, 'ul. Mickiewicza 7', 'Mieszkanie 70', 'Katowice', '40-001'),
(8, 'ul. Konopnickiej 8', 'Mieszkanie 80', 'Lublin', '20-001'),
(9, 'ul. Reymonta 9', 'Mieszkanie 90', 'Białystok', '15-001'),
(10, 'ul. Słowackiego 10', 'Mieszkanie 100', 'Szczecin', '70-001');




INSERT INTO Doctor ( DOCTOR_NUMBER, EMAIL , FIRST_NAME , LAST_NAME , SPECIALIZATION , TELEPHONE_NUMBER  , ADDRESS_ID  ) VALUES
( 'DOC001', 'jan.kowalski@example.com', 'Jan', 'Kowalski', 'Kardiologia', '123456789', 1),
( 'DOC002', 'anna.nowak@example.com', 'Anna', 'Nowak', 'Neurologia', '987654321', 2),
( 'DOC003', 'piotr.zielinski@example.com', 'Piotr', 'Zielinski', 'Dermatologia', '456789123', 3);

-- Tabela Patient
INSERT INTO Patient (ID, DATE_OF_BIRTH ,EMAIL ,FIRST_NAME, HEIGHT ,LAST_NAME ,PATIENT_NUMBER ,TELEPHONE_NUMBER ,ADDRESS_ID ) VALUES
('1', '1980-01-01', 'patient1@example.com', 'Marek', '177' , 'Kowalski', 'PAT001', '789123456', 4),
('2', '1990-02-02', 'patient2@example.com', 'Ewa',  '177' , 'Ewowska', 'PAT002', '321654987', 5),
('3', '2000-03-03', 'patient3@example.com', 'Tomasz',  '177' , 'Tomowski', 'PAT003', '654321789', 6);

-- Tabela Visit
INSERT INTO Visit (DESCRIPTION , TIME , DOCTOR_ID , PATIENT_ID ) VALUES
('Wizyta kontrolna', '2024-05-26 10:00:00', 1, 1),
('Wizyta kontrolna', '2024-05-27 11:00:00', 2, 2),
('Wizyta kontrolna', '2024-05-28 12:00:00', 3, 3),
('Wizyta kontrolna', '2024-05-26 10:00:00', 1, 1),
('Wizyta kontrolna', '2024-05-27 11:00:00', 2, 2),
('Wizyta kontrolna', '2024-05-28 12:00:00', 3, 3),
('Wizyta kontrolna', '2024-05-26 10:00:00', 1, 1),
('Wizyta kontrolna', '2024-05-27 11:00:00', 2, 2),
('Wizyta kontrolna', '2024-05-28 12:00:00', 3, 3);

-- Tabela MEDICAL_TREATMENT 
INSERT INTO MEDICAL_TREATMENT  ( DESCRIPTION , TYPE, VISIT_ID ) VALUES
( 'RTG', 'Kardiologia', 1),
( 'EKG', 'Neurologia', 2),
( 'RTG', 'Dermatologia', 3);
