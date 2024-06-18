
CREATE database feature_flags;
CREATE USER  ff_user WITH PASSWORD 'ff_password';
GRANT CONNECT ON DATABASE feature_flags TO ff_user;


CREATE USER unleash WITH PASSWORD 'unleash';
CREATE DATABASE unleash;

\connect unleash
GRANT ALL PRIVILEGES ON DATABASE unleash to unleash;
create SCHEMA unleash;
GRANT USAGE ON SCHEMA unleash TO unleash;
GRANT ALL ON SCHEMA unleash TO unleash;
GRANT ALL PRIVILEGES ON SCHEMA unleash TO unleash;
GRANT ALL ON ALL TABLES IN SCHEMA unleash TO unleash;


GRANT USAGE, CREATE ON SCHEMA public TO unleash;



\connect feature_flags
create SCHEMA feature_flags;
GRANT USAGE ON SCHEMA feature_flags TO ff_user;
GRANT ALL ON SCHEMA feature_flags TO ff_user;
GRANT ALL PRIVILEGES ON SCHEMA feature_flags TO ff_user;
GRANT ALL ON ALL TABLES IN SCHEMA feature_flags TO ff_user;




