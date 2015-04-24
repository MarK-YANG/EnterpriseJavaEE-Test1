-- create table of sources of books
CREATE TABLE Sources (
	source_numb integer not null primary key,
	source_name varchar (55) ,
	source_street varchar (55) ,
	source_city varchar (55) ,
	source_state char (2) ,
	source_zip char(5) ,
        source_phone char (12) 
) ;

-- create books table with FK's to sources
CREATE TABLE Books(
	isbn varchar(20) NOT NULL primary key,
	author_name varchar (50) , 
	title varchar (255) ,
	publisher_name varchar (50),
	publication_year integer,
	binding varchar (55),
	source_numb integer ,
	retail_price decimal(8,2) ,
	number_on_hand integer
);


-- load sources
insert into Sources
values (1,'Ingram','123 West 99th','Philadelphia','PA','19112','555-555-1111');
insert into Sources
values (2,'Baker and Taylor','99 256th Ave','Minneapolis','MN','68112','551-555-2222');
insert into Sources
values (3,'Jostens','19594 Highway 28','Seattle','WA','98333','552-555-3333');
insert into Sources
values (4,'Brodart','1944 Bayview Blvd','Los Angeles','CA','96111','553-555-4444');


-- load books
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-123-1233-0','Dumas, Alexandre','Three Musketeers, The','Grosset & Dunlap',1953,'hc',1,15.95,10);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-124-2999-9','Twain, Mark','Celebrated Jumping Frog of Calaveras County','Harper',1903,'hc',1,18.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-124-5544-X','Dumas, Alexandre','Titans, The','Harper',1957,'hc',1,18.95,4);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-124-7989-1','Twain, Mark','Dog\"s Tale, A','Harper',1904,'hc',1,19.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-125-3344-1','Dumas, Alexandre','Black Tulip, The','P. F. Collier & So',1902,'hc',1,18.95,3);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-126-3367-2','Dumas, Alexandre','Count of Monte Cristo, The','Platt & Munk',1968,'hc',1,21.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-127-3948-2','Dumas, Alexandre','Corsican Brothers, The','Metheu',1970,'hc',1,15.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-128-3939-2','Clavell, James','Gai-Ji','Delacorte',1993,'hc',1,25.95,15);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-128-3939-X','Clavell, James','Noble House','Delacorte',1981,'hc',1,22.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-128-4321-1','Clavell, James','Tai-Pa','Delacorte',1966,'hc',1,22.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-129-4567-1','McCaffrey, Anne','Dragonsong','Atheneum',1976,'hc',2,18.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-129-4912-0','McCaffrey, Anne','Dragonsinger','Atheneum',1977,'hc',2,19.95,13);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-129-9293-2','Lee, Tanith','Black Unicor','Atheneum',1991,'hc',3,21.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-129-9876-5','Clavell, James','Shogu','Atheneum',1975,'hc',1,24.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-130-2939-4','McCaffrey, Anne','White Dragon, The','Ballantine Books',1978,'hc',2,21.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-130-2943-2','McCaffrey, Anne','Dragonflight','Ballantine Books',1978,'hc',1,15.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-130-3941-7','Rice, Anne','Feast of All Saints, The','Ballantine Books',1992,'hc',2,24.95,18);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-130-9483-1','McCaffrey, Anne','Dragonquest','Ballantine Books',1979,'hc',2,21.95,9);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-131-1458-9','Rice, Anne','Interview with the Vampire','Knopf',1976,'hc',2,23.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-131-3021-2','Rice, Anne','Tale of the Body Thief, The','Knopf',1992,'hc',2,24.95,18);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-131-4809-X','Rice, Anne','Vampire Lestat, The','Knopf',1985,'hc',2,22.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-131-4912-X','Rice, Anne','Taltos','Knopf',1994,'hc',2,24.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-131-4966-9','Rice, Anne','Lasher','Knopf',1993,'hc',1,23.95,15);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-131-9456-2','Rice, Anne','Cry to Heave','Knopf',1982,'hc',2,25.95,16);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-132-3949-2','Twain, Mark','Prince and the Pauper, The','James R. Osgood and Co.',1882,'hc',3,19.95,10);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-132-9876-4','Twain, Mark','Life on the Mississippi','James R. Osgood and Co.',1883,'hc',3,19.95,11);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-133-2956-6','Twain, Mark','Inoocents Abroad, The','American Publishing Co.',1869,'hc',3,19.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-133-5935-2','Twain, Mark','Pudd\"nhead Wilso','American Publishing Co.',1894,'hc',3,17.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-134-3945-7','Stevenson, Robert Louis','Child\"s Garden of Verses, A','Scribner',1905,'hc',4,21.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-135-2222-2','Stevenson, Robert Louis','Treasure Island','J. W. Lovell Co.',1886,'hc',4,24.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-136-3956-1','Stevenson, Robert Louis','Kidnapped','Dodd, Mead',1949,'hc',2,22.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-136-3966-7','Stevenson, Robert Louis','Strange Case of Dr. Jekyll and Mr. Hyde','Dodd, Mead',1964,'hc',2,23.95,18);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-137-1293-9','Scott, Sir Walter','Rob Roy','D. Appleton & Co.',1898,'hc',4,21.95,22);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-138-1379-8','Scott, Sir Walter','Ivanhoe','Hart Publishing Co.',1977,'hc',1,22.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-140-3877-0','Scott, Sir Walter','Waverly Novels','University of Nebraska Press',1978,'hc',4,27.95,3);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-141-9876-4','Bronte, Emily','Complete Poems of Emily Jane Bronte, The','Columbia University Press',1941,'hc',4,21.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-142-0084-2','Butler, Octavia','Clay\"s Ark','St. Martin\"s Press',1984,'hc',2,21.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-142-3867-8','Bronte, Emily','Wuthering Heights','St. Martin\"s Press',1968,'hc',3,21.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-142-3988-2','Lee, Tanith','East of Midnight','St. Martin\"s Press',1978,'hc',2,19.95,15);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-150-3765-2','Ludlum, Robert','Aquitaine Progression, The','Random House',1984,'hc',3,25.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-150-3949-9','Ludlum, Robert','Parsifal Mosaic, The','Random House',1982,'hc',1,24.95,14);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-150-5948-9','Bronte, Charlotte','Jane Eyre','Random House',1943,'hc',3,19.95,15);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-151-9876-2','Bronte, Charlotte','Vilette','Clarendon Press',1984,'hc',3,21.95,15);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-155-2346-5','Burroughs, Edgar Rice','Tarzan and the Forbidden City','E. R. burroughs, Inc.',1938,'hc',2,18.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-157-3849-X','Burroughs, Edgar Rice','People that Time Forgot, The','Tandem',1975,'hc',3,19.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-157-9876-2','Burroughs, Edgar Rice','Out of Time\"s Abyss','Tandem',1973,'hc',3,21.95,4);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-158-0493-2','Burroughs, Edgar Rice','Tarzan the Magnificent','New English Library',1974,'hc',4,21.95,3);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-158-8374-3','Burroughs, Edgar Rice','Tarzan of the Apes','New English Library',1975,'hc',4,21.95,3);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-159-2948-2','Burroughs, Edgar Rice','War Chief, The','Gregg Press',1927,'hc',2,19.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-159-3845-3','Burroughs, Edgar Rice','Bandit of Hell\"s Bend, The','Gregg Press',1925,'hc',2,19.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-159-5839-3','Burroughs, Edgar Rice','Apache Devil','Gregg Press',1933,'hc',2,19.95,4);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-160-3456-7','Ludlum, Robert','Gemini Contenders, The','Dial Press',1976,'hc',3,24.95,22);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-160-8325-7','Ludlum, Robert','Chancellor Manuscript, The','Dial Press',1977,'hc',3,23.95,18);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-161-0123-9','Ludlum, Robert','Bourne Identify, The','R. Marek Publishers',1980,'hc',3,23.95,10);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-161-8478-1','Ludlum, Robert','Holcroft Covenant, The','R. Marek Publishers',1978,'hc',2,24.95,16);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-162-3948-0','Barth, Joh','Chimera','Deutsch',1974,'hc',3,17.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-164-4857-2','Barth, Joh','Sabbatical: A Romance','Putnam',1982,'hc',4,24.95,7);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-164-5968-0','Barth, Joh','Letters: A Novel','Putnam',1979,'hc',3,27.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-166-8394-3','Barth, Joh','Sot-Weed Factor, The','Franklin Library',1980,'hc',3,27.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-167-1945-1','Barth, Joh','Floating Opera and The End of the Road, The','Anchor Press',1988,'hc',4,24.95,9);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-167-3965-2','Barth, Joh','Giles Goat-Boy','Anchor Press',1987,'hc',3,24.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-2945-9','Lee, Tanith','Electric Forest','Doubleday',1979,'hc',2,19.95,21);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-3948-2','Butler, Octavia','Patternmaster','Doubleday',1976,'hc',4,18.95,19);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-4567-3','Butler, Octavia','Survivor','Doubleday',1978,'hc',3,15.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-4712-X','Butler, Octavia','Mind of My Mind','Doubleday',1977,'hc',1,19.95,4);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-4921-4','Cherryh, C. J.','Hunter of Worlds','Doubleday',1977,'hc',3,21.95,18);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-4977-5','Cherryh, C. J.','Brothers of Earth','Doubleday',1976,'hc',3,23.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-6464-4','Cherryh, C. J.','Serpent\"s Reach','Doubleday',1980,'hc',3,19.95,9);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-7388-1','Cherryh, C. J.','Faded Sun, Kesrith, The','Doubleday',1978,'hc',3,21.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-7400-X','Cherryh, C. J.','Faded Sun, Shon\"jir, The','Doubleday',1978,'hc',3,21.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-8644-2','Butler, Octavia','Wild Seed','Doubleday',1980,'hc',3,19.95,9);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-180-8655-0','Butler, Octavia','Kindred','Doubleday',1979,'hc',3,18.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-185-8776-2','Lee, Tanith','Castle of Dark, The','Macmilla',1978,'hc',4,21.95,6);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-185-9855-2','Lee, Tanith','Winter Players, The','Macmilla',1977,'hc',2,15.95,12);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-190-2345-2','Lee, Tanith','Book of the Damned, The','Overlook Press',1990,'hc',4,21.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-190-3956-1','Lee, Tanith','Book of the Beast, The','Overlook Press',1991,'hc',4,22.95,8);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-190-3967-5','Lee, Tanith','Book of the Dead, The','Overlook Press',1991,'hc',4,22.95,3);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-191-4893-0','Cherryh, C. J.','Rimrunners','Warner Books',1989,'hc',2,19.95,2);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-191-4934-8','Cherryh, C. J.','Heavy Time','Warner Books',1991,'hc',2,23.95,7);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-191-4959-2','Cherryh, C. J.','Cytee','Warner Books',1988,'hc',2,18.95,5);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-191-8654-3','Cherryh, C. J.','Hellburner','Warner Books',1992,'hc',2,23.95,10);
INSERT INTO Books (isbn,author_name,title,publisher_name,publication_year,binding,source_numb,retail_price,number_on_hand) VALUES ('0-200-3939-2','Bronte, Emily','My Very Best Work','Harper',1810,'hb',2,18.95,6);

