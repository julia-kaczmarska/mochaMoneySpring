CREATE TABLE `user` (
                        `user_id` integer PRIMARY KEY,
                        `name` varchar(255),
                        `email` varchar(255),
                        `password` varchar(255),
                        `categoryInc_id` integer,
                        `categoryExp_id` integer
);

CREATE TABLE `budget` (
                          `budget_id` integer PRIMARY KEY,
                          `title` varchar(255)
);

CREATE TABLE `sharing` (
                           `sharing_id` integer PRIMARY KEY,
                           `user_id` integer,
                           `budget_id` integer
);

CREATE TABLE `income` (
                          `income_id` integer PRIMARY KEY,
                          `amount` float,
                          `date` date,
                          `plan` bool,
                          `categoryInc_id` integer,
                          `budget_id` integer
);

CREATE TABLE `expense` (
                           `expense_id` integer PRIMARY KEY,
                           `amount` float,
                           `date` date,
                           `plan` bool,
                           `categoryExp_id` integer,
                           `budget_id` integer
);

CREATE TABLE `categoryInc` (
                               `categoryInc_id` integer PRIMARY KEY,
                               `title` varchar(255)
);

CREATE TABLE `categoryExp` (
                               `categoryExp_id` integer PRIMARY KEY,
                               `title` varchar(255)
);

ALTER TABLE `sharing` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

ALTER TABLE `sharing` ADD FOREIGN KEY (`budget_id`) REFERENCES `budget` (`budget_id`);

ALTER TABLE `user` ADD FOREIGN KEY (`categoryInc_id`) REFERENCES `categoryInc` (`categoryInc_id`);

ALTER TABLE `user` ADD FOREIGN KEY (`categoryExp_id`) REFERENCES `categoryExp` (`categoryExp_id`);

ALTER TABLE `income` ADD FOREIGN KEY (`budget_id`) REFERENCES `budget` (`budget_id`);

ALTER TABLE `expense` ADD FOREIGN KEY (`budget_id`) REFERENCES `budget` (`budget_id`);

ALTER TABLE `expense` ADD FOREIGN KEY (`categoryExp_id`) REFERENCES `categoryExp` (`categoryExp_id`);

ALTER TABLE `income` ADD FOREIGN KEY (`categoryInc_id`) REFERENCES `categoryInc` (`categoryInc_id`);
