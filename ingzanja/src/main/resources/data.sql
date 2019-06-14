insert into pacient (id, ime, prezime, godiste, jmbg, rasa, pol) values (1, 'Nikola', 'Nikolic', 1995, '0605995172650', 'white', 'male');
insert into pacient (id, ime, prezime, godiste, jmbg, rasa, pol) values (2, 'Sima', 'Simic', 1996, '0612995172650', 'white', 'male');

insert into pregled (id,pacient_id) values (1,1);
insert into pregled (id,pacient_id) values (2,1);
insert into pregled (id,pacient_id) values (3,2);
insert into pregled (id,pacient_id) values (4,2);


insert into pregled_simptomi(pregled_id, simptom_id) values (1,1);
insert into pregled_simptomi(pregled_id, simptom_id) values (1,2);
insert into pregled_simptomi(pregled_id, simptom_id) values (1,3);
insert into pregled_simptomi(pregled_id, simptom_id) values (1,4);
insert into pregled_simptomi(pregled_id, simptom_id) values (2,1);
insert into pregled_simptomi(pregled_id, simptom_id) values (2,41);
insert into pregled_simptomi(pregled_id, simptom_id) values (3,1);
insert into pregled_simptomi(pregled_id, simptom_id) values (3,2);
insert into pregled_simptomi(pregled_id, simptom_id) values (3,3);
insert into pregled_simptomi(pregled_id, simptom_id) values (4,13);
insert into pregled_simptomi(pregled_id, simptom_id) values (4,15);
insert into pregled_simptomi(pregled_id, simptom_id) values (4,16);
insert into pregled_simptomi(pregled_id, simptom_id) values (4,1);




insert into simptom (naziv) values  ('abnormal_involuntary_movements');
insert into simptom (naziv) values  ('apnea');
insert into simptom (naziv) values  ('arm_pain');
insert into simptom (naziv) values  ('arm_swelling');
insert into simptom (naziv) values  ('burning_chest_pain');
insert into simptom (naziv) values  ('chest_tightness');
insert into simptom (naziv) values  ('cough');
insert into simptom (naziv) values  ('cross-eyed');
insert into simptom (naziv) values  ('decreased_heart_rate');
insert into simptom (naziv) values  ('depression');
insert into simptom (naziv) values  ('difficulty_breathing');
insert into simptom (naziv) values  ('dizziness');
insert into simptom (naziv) values  ('ear_pain');
insert into simptom (naziv) values  ('elbow_cramps_or_spasms');
insert into simptom (naziv) values  ('elbow_weakness');
insert into simptom (naziv) values  ('excessive_appetite');
insert into simptom (naziv) values  ('excessive_growth');
insert into simptom (naziv) values  ('fainting');
insert into simptom (naziv) values  ('fatigue');
insert into simptom (naziv) values  ('feeling_ill');
insert into simptom (naziv) values  ('fluid_retention');
insert into simptom (naziv) values  ('hand_or_finger_stiffness_or_tightness');
insert into simptom (naziv) values  ('heartburn');
insert into simptom (naziv) values  ('hip_stiffness_or_tightness');
insert into simptom (naziv) values  ('hurts_to_breath');
insert into simptom (naziv) values  ('increased_heart_rate');
insert into simptom (naziv) values  ('infant_feeding_problem');
insert into simptom (naziv) values  ('insomnia');
insert into simptom (naziv) values  ('irregular_belly_button_');
insert into simptom (naziv) values  ('irregular_heartbeat');
insert into simptom (naziv) values  ('itchy_eyelid');
insert into simptom (naziv) values  ('lack_of_growth');
insert into simptom (naziv) values  ('leg_swelling');
insert into simptom (naziv) values  ('lower_body_pain');
insert into simptom (naziv) values  ('lymphedema');
insert into simptom (naziv) values  ('mouth_dryness');
insert into simptom (naziv) values  ('muscle_pain');
insert into simptom (naziv) values  ('nailbiting');
insert into simptom (naziv) values  ('nausea');
insert into simptom (naziv) values  ('neck_cramps_or_spasms');
insert into simptom (naziv) values  ('pallor');
insert into simptom (naziv) values  ('palpitations');
insert into simptom (naziv) values  ('peripheral_edema');
insert into simptom (naziv) values  ('plugged_feeling_in_ear');
insert into simptom (naziv) values  ('recent_pregnancy');
insert into simptom (naziv) values  ('sharp_chest_pain');
insert into simptom (naziv) values  ('shortness_of_breath');
insert into simptom (naziv) values  ('slurring_words');
insert into simptom (naziv) values  ('sweating');
insert into simptom (naziv) values  ('throat_feels_tight');
insert into simptom (naziv) values  ('weakness');
insert into simptom (naziv) values  ('weight_gain');
insert into simptom (naziv) values  ('wrist_weakness');