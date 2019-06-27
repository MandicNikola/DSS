
insert into pacient (id, ime, prezime, godiste, jmbg, rasa, pol,telefon,adresa,alkohol,pusac,debljina)
values (1, 'Nikola', 'Nikolic', 1995, '0605995172650', 'white', 'male','0618454545','Tekeljina 25',false, true, 'fat');
insert into pacient (id, ime, prezime, godiste, jmbg, rasa, pol,telefon,adresa,alkohol,pusac,debljina) values
(2, 'Sima', 'Simic', 1996, '0612995172650', 'white', 'male','0607545612','BB 25',true, true, 'skinny');
insert into pacient (id, ime, prezime, godiste, jmbg, rasa, pol,telefon,adresa,alkohol,pusac,debljina) values
(3, 'Pera', 'Peric', 1977, '0612977172650', 'white', 'male','0601255612','Bulevar 25',true, false, 'skinny');
insert into pacient (id, ime, prezime, godiste, jmbg, rasa, pol,telefon,adresa,alkohol,pusac,debljina) values
(4, 'Ana', 'Anic', 1965, '1206965172750', 'white', 'female','0601255456','Nova 12',false , false, 'fat');

/*
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


*/

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
insert into simptom (naziv) values  ('irregular_belly_button');
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

--bolesti
insert into bolest (id, naziv) values (1, 'heart_block');
insert into bolest (id, naziv) values (2, 'heart_attack');
insert into bolest (id, naziv) values (3, 'heart_failure');
insert into bolest (id, naziv) values (4, 'heart_contusion');
insert into bolest (id, naziv) values (5, 'increased_heart_rate');
insert into bolest (id, naziv) values (6, 'decreased_heart_rate');
insert into bolest (id, naziv) values (7, 'ischemic_heart_disease');
insert into bolest (id, naziv) values (8, 'congenital_heart_defect');
insert into bolest (id, naziv) values (9, 'hypertensive_heart_disease');

--terapije
insert into terapija (id, naziv) values (1, 'polyethylene_glycol_3350');
insert into terapija (id, naziv) values (2, 'clopidogrel');
insert into terapija (id, naziv) values (3, 'ezetimibe');
insert into terapija (id, naziv) values (4, 'antihemophilic_factor');
insert into terapija (id, naziv) values (5, 'hyzaar');
insert into terapija (id, naziv) values (6, 'bacitracin');
insert into terapija (id, naziv) values (7, 'etomidate');
insert into terapija (id, naziv) values (8, 'cefdinir');
insert into terapija (id, naziv) values (9, 'oxygen');
insert into terapija (id, naziv) values (10, 'prazosin');
insert into terapija (id, naziv) values (11, 'cortisone');
insert into terapija (id, naziv) values (12, 'palivizumab');
insert into terapija (id, naziv) values (13, 'glimepiride');
insert into terapija (id, naziv) values (14, 'loratadine');
insert into terapija (id, naziv) values (15, 'hydralazine');
insert into terapija (id, naziv) values (16, 'zoledronic_acid');
insert into terapija (id, naziv) values (17, 'triamterene');
insert into terapija (id, naziv) values (18, 'niacin');
insert into terapija (id, naziv) values (19, 'valsartan');
insert into terapija (id, naziv) values (20, 'spironolactone');
insert into terapija (id, naziv) values (21, 'glucosamine');
insert into terapija (id, naziv) values (22, 'potassium_chloride');
insert into terapija (id, naziv) values (23, 'bisoprolol');
insert into terapija (id, naziv) values (24, 'quinapril');
insert into terapija (id, naziv) values (25, 'propafenone');
insert into terapija (id, naziv) values (26, 'insulin_aspart-insulin_aspart_protamine');
insert into terapija (id, naziv) values (27, 'warfarin');
insert into terapija (id, naziv) values (28, 'treprostinil');
insert into terapija (id, naziv) values (29, 'haemophilus_b_conjugate_vaccine');
insert into terapija (id, naziv) values (30, 'torsemide');
insert into terapija (id, naziv) values (31, 'pyrithione_zinc_topical');
insert into terapija (id, naziv) values (32, 'amiodarone');
insert into terapija (id, naziv) values (33, 'benazepril');
insert into terapija (id, naziv) values (34, 'chondroitin');
insert into terapija (id, naziv) values (35, 'digoxin');
insert into terapija (id, naziv) values (36, 'chlorothiazide');
insert into terapija (id, naziv) values (37, 'lutein');
insert into terapija (id, naziv) values (38, 'dopamine');
insert into terapija (id, naziv) values (39, 'dutasteride');
insert into terapija (id, naziv) values (40, 'flecainide');
insert into terapija (id, naziv) values (41, 'tenecteplase');
insert into terapija (id, naziv) values (42, 'dorzolamide_ophthalmic');
insert into terapija (id, naziv) values (43, 'dimenhydrinate');
insert into terapija (id, naziv) values (44, 'bosentan');
insert into terapija (id, naziv) values (45, 'influenza_virus_vaccine');
insert into terapija (id, naziv) values (46, 'sodium_polystyrene_sulfonate');
insert into terapija (id, naziv) values (47, 'bumetanide');
insert into terapija (id, naziv) values (48, 'beclomethasone');
insert into terapija (id, naziv) values (49, 'metoprolol');
insert into terapija (id, naziv) values (50, 'captopril');
insert into terapija (id, naziv) values (51, 'nitroglycerin');
insert into terapija (id, naziv) values (52, 'hepatitis_a_vaccine');
insert into terapija (id, naziv) values (53, 'carvedilol');
insert into terapija (id, naziv) values (54, 'carbon_dioxide');
insert into terapija (id, naziv) values (55, 'amlodipine');
insert into terapija (id, naziv) values (56, 'furosemide');
insert into terapija (id, naziv) values (57, 'sotalol');
insert into terapija (id, naziv) values (58, 'sodium_bicarbonate');
insert into terapija (id, naziv) values (59, 'fenofibrate');
insert into terapija (id, naziv) values (60, 'felodipine');
insert into terapija (id, naziv) values (61, 'procainamide');
insert into terapija (id, naziv) values (62, 'atropine');
insert into terapija (id, naziv) values (63, 'aspirin');
insert into terapija (id, naziv) values (64, 'glucagon');
insert into terapija (id, naziv) values (65, 'adenosine');
insert into terapija (id, naziv) values (66, 'heparin');
insert into terapija (id, naziv) values (67, 'eptifibatide');
insert into terapija (id, naziv) values (68, 'metolazone');
insert into terapija (id, naziv) values (69, 'entecavir');
insert into terapija (id, naziv) values (70, 'escitalopram');
insert into terapija (id, naziv) values (71, 'enoxaparin');
insert into terapija (id, naziv) values (72, 'rosuvastatin');
insert into terapija (id, naziv) values (73, 'isosorbide');
insert into terapija (id, naziv) values (74, 'brompheniramine');
insert into terapija (id, naziv) values (75, 'ambrisentan');
insert into terapija (id, naziv) values (76, 'esmolol');
insert into terapija (id, naziv) values (77, 'allopurinol');
insert into terapija (id, naziv) values (78, 'fondaparinux');
insert into terapija (id, naziv) values (79, 'isoproterenol');
insert into terapija (id, naziv) values (80, 'mecamylamine');
insert into terapija (id, naziv) values (81, 'ascorbic_acid');

--dijagnostika
insert into dijagnostika (id, naziv) values (1, 'cardiac_enzymes_measurement');
insert into dijagnostika (id, naziv) values (2, 'intravenous_fluid_replacement');
insert into dijagnostika (id, naziv) values (3, 'plain_x-ray');
insert into dijagnostika (id, naziv) values (4, 'hematologic_tests');
insert into dijagnostika (id, naziv) values (5, 'cardiac_stress_tests');
insert into dijagnostika (id, naziv) values (6, 'cat_scan_of_head');
insert into dijagnostika (id, naziv) values (7, 'glucose_measurement');
insert into dijagnostika (id, naziv) values (8, 'echocardiography');
insert into dijagnostika (id, naziv) values (9, 'other_diagnostic_procedures');
insert into dijagnostika (id, naziv) values (10, 'lipid_panel');
insert into dijagnostika (id, naziv) values (11, 'x-ray_computed_tomography');
insert into dijagnostika (id, naziv) values (12, 'electrocardiogram');
insert into dijagnostika (id, naziv) values (13, 'wound_care_management');
insert into dijagnostika (id, naziv) values (14, 'electrolytes_panel');
insert into dijagnostika (id, naziv) values (15, 'ultrasonography');
insert into dijagnostika (id, naziv) values (16, 'diagnostic_cardiac_catheterization');
insert into dijagnostika (id, naziv) values (17, 'other_therapeutic_procedures');
insert into dijagnostika (id, naziv) values (18, 'cardiopulmonary_resuscitation');
insert into dijagnostika (id, naziv) values (19, 'kidney_function_tests');
insert into dijagnostika (id, naziv) values (20, 'radiographic_imaging_procedure');
insert into dijagnostika (id, naziv) values (21, 'complete_physical_skin_exam_performed');
insert into dijagnostika (id, naziv) values (22, 'complete_blood_count');


insert into porodicne_bolesti (id_pacijent,id_bolest) values (1,1);
insert into porodicne_bolesti (id_pacijent,id_bolest) values (1,2);
insert into porodicne_bolesti (id_pacijent,id_bolest) values (1,3);

insert into porodicne_bolesti (id_pacijent,id_bolest) values (2,1);
insert into porodicne_bolesti (id_pacijent,id_bolest) values (2,5);
insert into porodicne_bolesti (id_pacijent,id_bolest) values (2,7);


insert into istorija_bolesti (id_pacijent,id_bolest) values (1,1);
insert into istorija_bolesti (id_pacijent,id_bolest) values (2,5);
