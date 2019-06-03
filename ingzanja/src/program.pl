disease_symptoms(heart_block, [sharp_chest_pain,shortness_of_breath,dizziness,fainting,weakness,palpitations,chest_tightness,peripheral_edema,decreased_heart_rate,weight_gain,increased_heart_rate,irregular_heartbeat]).

disease_symptom_percent(heart_block, sharp_chest_pain, 48.0).
disease_symptom_percent(heart_block, shortness_of_breath, 46.0).
disease_symptom_percent(heart_block, dizziness, 39.0).
disease_symptom_percent(heart_block, fainting, 33.0).
disease_symptom_percent(heart_block, weakness, 29.0).
disease_symptom_percent(heart_block, palpitations, 24.0).
disease_symptom_percent(heart_block, chest_tightness, 18.0).
disease_symptom_percent(heart_block, peripheral_edema, 15.0).
disease_symptom_percent(heart_block, decreased_heart_rate, 12.0).
disease_symptom_percent(heart_block, weight_gain, 12.0).
disease_symptom_percent(heart_block, increased_heart_rate, 12.0).
disease_symptom_percent(heart_block, irregular_heartbeat, 8.0).

test_for_disease(heart_block, electrocardiogram).
test_for_disease(heart_block, radiographic_imaging_procedure).
test_for_disease(heart_block, complete_blood_count_(cbc)).
test_for_disease(heart_block, plain_x-ray_(x_ray)).
test_for_disease(heart_block, glucose_measurement_(glucose_level)).
test_for_disease(heart_block, cardiac_enzymes_measurement_(cardiac_enzymes_test)).
test_for_disease(heart_block, intravenous_fluid_replacement).
test_for_disease(heart_block, electrolytes_panel).

treatment_for_disease(heart_block, glucosamine).
treatment_for_disease(heart_block, ascorbic_acid).
treatment_for_disease(heart_block, glimepiride).
treatment_for_disease(heart_block, amiodarone).
treatment_for_disease(heart_block, atropine_(uaa)).
treatment_for_disease(heart_block, felodipine).
treatment_for_disease(heart_block, dutasteride_(avodart)).
treatment_for_disease(heart_block, metolazone).
treatment_for_disease(heart_block, sotalol).
treatment_for_disease(heart_block, triamterene).
treatment_for_disease(heart_block, bumetanide).
treatment_for_disease(heart_block, chondroitin).
treatment_for_disease(heart_block, flecainide).

sexRisk(male ,heart_block, 1.2).
sexRisk(female ,heart_block, 0.8).

raceRisk(black,heart_block, 0.4).
raceRisk(white, heart_block, 1.3).
raceRisk(hispanic, heart_block, 0.8).

yearRisk(0, heart_block, 0.13).
yearRisk(1, heart_block, 0.2).
yearRisk(2, heart_block, 0.45).
yearRisk(3, heart_block, 3.55).

disease_symptoms(heart_attack, [sharp_chest_pain,shortness_of_breath,chest_tightness,nausea,arm_pain,fainting,sweating,lower_body_pain,heartburn,irregular_heartbeat,burning_chest_pain,increased_heart_rate]).

disease_symptom_percent(heart_attack, sharp_chest_pain, 90.0).
disease_symptom_percent(heart_attack, shortness_of_breath, 56.0).
disease_symptom_percent(heart_attack, chest_tightness, 37.0).
disease_symptom_percent(heart_attack, nausea, 25.0).
disease_symptom_percent(heart_attack, arm_pain, 20.0).
disease_symptom_percent(heart_attack, fainting, 17.0).
disease_symptom_percent(heart_attack, sweating, 10.0).
disease_symptom_percent(heart_attack, lower_body_pain, 8.0).
disease_symptom_percent(heart_attack, heartburn, 8.0).
disease_symptom_percent(heart_attack, irregular_heartbeat, 6.0).
disease_symptom_percent(heart_attack, burning_chest_pain, 5.0).
disease_symptom_percent(heart_attack, increased_heart_rate, 4.0).

test_for_disease(heart_attack, electrocardiogram).
test_for_disease(heart_attack, hematologic_tests_(blood_test)).
test_for_disease(heart_attack, complete_blood_count_(cbc)).
test_for_disease(heart_attack, radiographic_imaging_procedure).
test_for_disease(heart_attack, plain_x-ray_(x_ray)).
test_for_disease(heart_attack, cardiac_enzymes_measurement_(cardiac_enzymes_test)).
test_for_disease(heart_attack, kidney_function_tests_(kidney_function_test)).
test_for_disease(heart_attack, intravenous_fluid_replacement).

treatment_for_disease(heart_attack, aspirin).
treatment_for_disease(heart_attack, nitroglycerin).
treatment_for_disease(heart_attack, metoprolol).
treatment_for_disease(heart_attack, clopidogrel_(plavix)).
treatment_for_disease(heart_attack, heparin).
treatment_for_disease(heart_attack, enoxaparin_(lovenox)).
treatment_for_disease(heart_attack, isosorbide).
treatment_for_disease(heart_attack, oxygen).
treatment_for_disease(heart_attack, eptifibatide_(integrilin)).
treatment_for_disease(heart_attack, amiodarone).
treatment_for_disease(heart_attack, dopamine).
treatment_for_disease(heart_attack, tenecteplase).
treatment_for_disease(heart_attack, bisoprolol_(emcor)).

sexRisk(male ,heart_attack, 1.4).
sexRisk(female ,heart_attack, 0.7).

raceRisk(black,heart_attack, 0.6).
raceRisk(white, heart_attack, 1.3).
raceRisk(hispanic, heart_attack, 0.5).

yearRisk(0, heart_attack, 0.01).
yearRisk(1, heart_attack, 0.2).
yearRisk(2, heart_attack, 0.85).
yearRisk(3, heart_attack, 2.25).

disease_symptoms(heart_failure, [shortness_of_breath,sharp_chest_pain,difficulty_breathing,peripheral_edema,cough,weakness,chest_tightness,leg_swelling,weight_gain,fluid_retention,palpitations,hurts_to_breath]).

disease_symptom_percent(heart_failure, shortness_of_breath, 77.0).
disease_symptom_percent(heart_failure, sharp_chest_pain, 47.0).
disease_symptom_percent(heart_failure, difficulty_breathing, 37.0).
disease_symptom_percent(heart_failure, peripheral_edema, 27.0).
disease_symptom_percent(heart_failure, cough, 27.0).
disease_symptom_percent(heart_failure, weakness, 22.0).
disease_symptom_percent(heart_failure, chest_tightness, 18.0).
disease_symptom_percent(heart_failure, leg_swelling, 14.0).
disease_symptom_percent(heart_failure, weight_gain, 10.0).
disease_symptom_percent(heart_failure, fluid_retention, 9.0).
disease_symptom_percent(heart_failure, palpitations, 8.0).
disease_symptom_percent(heart_failure, hurts_to_breath, 6.0).

test_for_disease(heart_failure, hematologic_tests_(blood_test)).
test_for_disease(heart_failure, radiographic_imaging_procedure).
test_for_disease(heart_failure, complete_blood_count_(cbc)).
test_for_disease(heart_failure, electrocardiogram).
test_for_disease(heart_failure, plain_x-ray_(x_ray)).
test_for_disease(heart_failure, glucose_measurement_(glucose_level)).
test_for_disease(heart_failure, electrolytes_panel).
test_for_disease(heart_failure, kidney_function_tests_(kidney_function_test)).

treatment_for_disease(heart_failure, furosemide).
treatment_for_disease(heart_failure, carvedilol).
treatment_for_disease(heart_failure, warfarin).
treatment_for_disease(heart_failure, nitroglycerin).
treatment_for_disease(heart_failure, digoxin).
treatment_for_disease(heart_failure, spironolactone).
treatment_for_disease(heart_failure, isosorbide).
treatment_for_disease(heart_failure, amiodarone).
treatment_for_disease(heart_failure, hydralazine).
treatment_for_disease(heart_failure, bumetanide).
treatment_for_disease(heart_failure, metolazone).
treatment_for_disease(heart_failure, potassium_chloride).
treatment_for_disease(heart_failure, torsemide).

sexRisk(male ,heart_failure, 1.2).
sexRisk(female ,heart_failure, 0.8).

raceRisk(black,heart_failure, 1.1).
raceRisk(white, heart_failure, 1.1).
raceRisk(hispanic, heart_failure, 0.6).

yearRisk(0, heart_failure, 0.125).
yearRisk(1, heart_failure, 0.2).
yearRisk(2, heart_failure, 0.65).
yearRisk(3, heart_failure, 3.2).

disease_symptoms(heart_contusion, [apnea,sharp_chest_pain,depression,fainting,itchy_eyelid,cross-eyed,excessive_growth,elbow_cramps_or_spasms,wrist_weakness,elbow_weakness,hip_stiffness_or_tightness,nailbiting]).

disease_symptom_percent(heart_contusion, apnea, 51.0).
disease_symptom_percent(heart_contusion, sharp_chest_pain, 51.0).
disease_symptom_percent(heart_contusion, depression, 51.0).
disease_symptom_percent(heart_contusion, fainting, 51.0).
disease_symptom_percent(heart_contusion, itchy_eyelid, 4.0).
disease_symptom_percent(heart_contusion, cross-eyed, 4.0).
disease_symptom_percent(heart_contusion, excessive_growth, 4.0).
disease_symptom_percent(heart_contusion, elbow_cramps_or_spasms, 4.0).
disease_symptom_percent(heart_contusion, wrist_weakness, 4.0).
disease_symptom_percent(heart_contusion, elbow_weakness, 4.0).
disease_symptom_percent(heart_contusion, hip_stiffness_or_tightness, 4.0).
disease_symptom_percent(heart_contusion, nailbiting, 4.0).

test_for_disease(heart_contusion, radiographic_imaging_procedure).
test_for_disease(heart_contusion, plain_x-ray_(x_ray)).
test_for_disease(heart_contusion, wound_care_management).
test_for_disease(heart_contusion, x-ray_computed_tomography_(scan_ct)).
test_for_disease(heart_contusion, intravenous_fluid_replacement).
test_for_disease(heart_contusion, cardiopulmonary_resuscitation_(cpr)).
test_for_disease(heart_contusion, cat_scan_of_head_(head_ct)).
test_for_disease(heart_contusion, cardiac_enzymes_measurement_(cardiac_enzymes_test)).

treatment_for_disease(heart_contusion, cortisone).
treatment_for_disease(heart_contusion, zoledronic_acid_(reclast)).
treatment_for_disease(heart_contusion, quinapril).
treatment_for_disease(heart_contusion, cefdinir).
treatment_for_disease(heart_contusion, polyethylene_glycol_3350_(miralax)).
treatment_for_disease(heart_contusion, hepatitis_a_vaccine_(obsolete)).
treatment_for_disease(heart_contusion, bacitracin_(septa)).
treatment_for_disease(heart_contusion, escitalopram_(lexapro)).
treatment_for_disease(heart_contusion, loratadine_(claritin)).
treatment_for_disease(heart_contusion, influenza_virus_vaccine,_inactivated).
treatment_for_disease(heart_contusion, mecamylamine).

sexRisk(male ,heart_contusion, 1.5).
sexRisk(female ,heart_contusion, 0.6).

raceRisk(black,heart_contusion, 0.5).
raceRisk(white, heart_contusion, 0.6).
raceRisk(hispanic, heart_contusion, 3.7).

yearRisk(0, heart_contusion, 2.375).
yearRisk(1, heart_contusion, 0.25).
yearRisk(2, heart_contusion, 0.45).
yearRisk(3, heart_contusion, 0.85).

disease_symptoms(increased_heart_rate, [shortness_of_breath,sharp_chest_pain,dizziness,palpitations,irregular_heartbeat,weakness,chest_tightness,fainting,abnormal_involuntary_movements,hurts_to_breath,mouth_dryness,pallor]).

disease_symptom_percent(increased_heart_rate, shortness_of_breath, 50.0).
disease_symptom_percent(increased_heart_rate, sharp_chest_pain, 49.0).
disease_symptom_percent(increased_heart_rate, dizziness, 41.0).
disease_symptom_percent(increased_heart_rate, palpitations, 32.0).
disease_symptom_percent(increased_heart_rate, irregular_heartbeat, 25.0).
disease_symptom_percent(increased_heart_rate, weakness, 23.0).
disease_symptom_percent(increased_heart_rate, chest_tightness, 22.0).
disease_symptom_percent(increased_heart_rate, fainting, 16.0).
disease_symptom_percent(increased_heart_rate, abnormal_involuntary_movements, 16.0).
disease_symptom_percent(increased_heart_rate, hurts_to_breath, 10.0).
disease_symptom_percent(increased_heart_rate, mouth_dryness, 5.0).
disease_symptom_percent(increased_heart_rate, pallor, 5.0).

test_for_disease(increased_heart_rate, electrocardiogram).
test_for_disease(increased_heart_rate, hematologic_tests_(blood_test)).
test_for_disease(increased_heart_rate, complete_blood_count_(cbc)).
test_for_disease(increased_heart_rate, radiographic_imaging_procedure).
test_for_disease(increased_heart_rate, plain_x-ray_(x_ray)).
test_for_disease(increased_heart_rate, cardiac_enzymes_measurement_(cardiac_enzymes_test)).
test_for_disease(increased_heart_rate, kidney_function_tests_(kidney_function_test)).
test_for_disease(increased_heart_rate, intravenous_fluid_replacement).

treatment_for_disease(increased_heart_rate, diltiazem).
treatment_for_disease(increased_heart_rate, adenosine).
treatment_for_disease(increased_heart_rate, flecainide).
treatment_for_disease(increased_heart_rate, fondaparinux_(arixtra)).
treatment_for_disease(increased_heart_rate, propafenone).
treatment_for_disease(increased_heart_rate, carbon_dioxide).
treatment_for_disease(increased_heart_rate, procainamide).
treatment_for_disease(increased_heart_rate, beclomethasone_(qvar)).
treatment_for_disease(increased_heart_rate, etomidate).
treatment_for_disease(increased_heart_rate, esmolol).

sexRisk(male ,increased_heart_rate, 1.0).
sexRisk(female ,increased_heart_rate, 1.0).

raceRisk(black,increased_heart_rate, 0.7).
raceRisk(white, increased_heart_rate, 1.2).
raceRisk(hispanic, increased_heart_rate, 0.7).

yearRisk(0, increased_heart_rate, 0.475).
yearRisk(1, increased_heart_rate, 0.85).
yearRisk(2, increased_heart_rate, 0.95).
yearRisk(3, increased_heart_rate, 1.52).

disease_symptoms(decreased_heart_rate, [shortness_of_breath,dizziness,fainting,ear_pain,sharp_chest_pain,difficulty_breathing,weakness,feeling_ill,chest_tightness,hurts_to_breath,plugged_feeling_in_ear,irregular_heartbeat]).

disease_symptom_percent(decreased_heart_rate, shortness_of_breath, 54.0).
disease_symptom_percent(decreased_heart_rate, dizziness, 42.0).
disease_symptom_percent(decreased_heart_rate, fainting, 34.0).
disease_symptom_percent(decreased_heart_rate, ear_pain, 29.0).
disease_symptom_percent(decreased_heart_rate, sharp_chest_pain, 29.0).
disease_symptom_percent(decreased_heart_rate, difficulty_breathing, 29.0).
disease_symptom_percent(decreased_heart_rate, weakness, 23.0).
disease_symptom_percent(decreased_heart_rate, feeling_ill, 17.0).
disease_symptom_percent(decreased_heart_rate, chest_tightness, 17.0).
disease_symptom_percent(decreased_heart_rate, hurts_to_breath, 17.0).
disease_symptom_percent(decreased_heart_rate, plugged_feeling_in_ear, 9.0).
disease_symptom_percent(decreased_heart_rate, irregular_heartbeat, 9.0).

test_for_disease(decreased_heart_rate, hematologic_tests_(blood_test)).
test_for_disease(decreased_heart_rate, complete_blood_count_(cbc)).
test_for_disease(decreased_heart_rate, radiographic_imaging_procedure).
test_for_disease(decreased_heart_rate, electrocardiogram).
test_for_disease(decreased_heart_rate, plain_x-ray_(x_ray)).
test_for_disease(decreased_heart_rate, kidney_function_tests_(kidney_function_test)).
test_for_disease(decreased_heart_rate, cardiac_enzymes_measurement_(cardiac_enzymes_test)).
test_for_disease(decreased_heart_rate, glucose_measurement_(glucose_level)).

treatment_for_disease(decreased_heart_rate, atropine_(uaa)).
treatment_for_disease(decreased_heart_rate, glucagon).
treatment_for_disease(decreased_heart_rate, sodium_polystyrene_sulfonate_(kayexalate)).
treatment_for_disease(decreased_heart_rate, dopamine).
treatment_for_disease(decreased_heart_rate, sodium_bicarbonate).
treatment_for_disease(decreased_heart_rate, sotalol).
treatment_for_disease(decreased_heart_rate, felodipine).
treatment_for_disease(decreased_heart_rate, isoproterenol).
treatment_for_disease(decreased_heart_rate, insulin_aspart-insulin_aspart_protamine).
treatment_for_disease(decreased_heart_rate, dimenhydrinate_(dramamine)).
treatment_for_disease(decreased_heart_rate, prazosin).
treatment_for_disease(decreased_heart_rate, lutein).
treatment_for_disease(decreased_heart_rate, dorzolamide_ophthalmic).

sexRisk(male ,decreased_heart_rate, 1.1).
sexRisk(female ,decreased_heart_rate, 0.9).

raceRisk(black,decreased_heart_rate, 0.6).
raceRisk(white, decreased_heart_rate, 1.3).
raceRisk(hispanic, decreased_heart_rate, 0.6).

yearRisk(0, decreased_heart_rate, 0.3).
yearRisk(1, decreased_heart_rate, 0.4).
yearRisk(2, decreased_heart_rate, 1.1).
yearRisk(3, decreased_heart_rate, 3.3).

disease_symptoms(ischemic_heart_disease, [sharp_chest_pain,shortness_of_breath,difficulty_breathing,palpitations,dizziness,fatigue,chest_tightness,peripheral_edema,lymphedema,increased_heart_rate,muscle_pain,throat_feels_tight]).

disease_symptom_percent(ischemic_heart_disease, sharp_chest_pain, 57.0).
disease_symptom_percent(ischemic_heart_disease, shortness_of_breath, 48.0).
disease_symptom_percent(ischemic_heart_disease, difficulty_breathing, 32.0).
disease_symptom_percent(ischemic_heart_disease, palpitations, 31.0).
disease_symptom_percent(ischemic_heart_disease, dizziness, 28.0).
disease_symptom_percent(ischemic_heart_disease, fatigue, 27.0).
disease_symptom_percent(ischemic_heart_disease, chest_tightness, 26.0).
disease_symptom_percent(ischemic_heart_disease, peripheral_edema, 13.0).
disease_symptom_percent(ischemic_heart_disease, lymphedema, 8.0).
disease_symptom_percent(ischemic_heart_disease, increased_heart_rate, 5.0).
disease_symptom_percent(ischemic_heart_disease, muscle_pain, 5.0).
disease_symptom_percent(ischemic_heart_disease, throat_feels_tight, 3.0).

test_for_disease(ischemic_heart_disease, hematologic_tests_(blood_test)).
test_for_disease(ischemic_heart_disease, electrocardiogram).
test_for_disease(ischemic_heart_disease, complete_blood_count_(cbc)).
test_for_disease(ischemic_heart_disease, glucose_measurement_(glucose_level)).
test_for_disease(ischemic_heart_disease, lipid_panel).
test_for_disease(ischemic_heart_disease, ultrasonography_(ultrasound)).
test_for_disease(ischemic_heart_disease, electrolytes_panel).
test_for_disease(ischemic_heart_disease, echocardiography).

treatment_for_disease(ischemic_heart_disease, carvedilol).
treatment_for_disease(ischemic_heart_disease, clopidogrel_(plavix)).
treatment_for_disease(ischemic_heart_disease, nitroglycerin).
treatment_for_disease(ischemic_heart_disease, digoxin).
treatment_for_disease(ischemic_heart_disease, spironolactone).
treatment_for_disease(ischemic_heart_disease, isosorbide).
treatment_for_disease(ischemic_heart_disease, rosuvastatin_(crestor)).
treatment_for_disease(ischemic_heart_disease, amiodarone).
treatment_for_disease(ischemic_heart_disease, niacin).
treatment_for_disease(ischemic_heart_disease, fenofibrate_(tricor)).
treatment_for_disease(ischemic_heart_disease, allopurinol).
treatment_for_disease(ischemic_heart_disease, torsemide).
treatment_for_disease(ischemic_heart_disease, ezetimibe_(zetia)).

sexRisk(male ,ischemic_heart_disease, 1.6).
sexRisk(female ,ischemic_heart_disease, 0.6).

raceRisk(black,ischemic_heart_disease, 0.5).
raceRisk(white, ischemic_heart_disease, 1.2).
raceRisk(hispanic, ischemic_heart_disease, 0.7).

yearRisk(0, ischemic_heart_disease, 0.01).
yearRisk(1, ischemic_heart_disease, 0.15).
yearRisk(2, ischemic_heart_disease, 0.6).
yearRisk(3, ischemic_heart_disease, 3.3).

disease_symptoms(congenital_heart_defect, [sharp_chest_pain,lack_of_growth,lymphedema,arm_swelling,infant_feeding_problem,slurring_words,irregular_belly_button_,cross-eyed,neck_cramps_or_spasms,decreased_heart_rate,excessive_appetite,hand_or_finger_stiffness_or_tightness]).

disease_symptom_percent(congenital_heart_defect, sharp_chest_pain, 26.0).
disease_symptom_percent(congenital_heart_defect, lack_of_growth, 6.0).
disease_symptom_percent(congenital_heart_defect, lymphedema, 6.0).
disease_symptom_percent(congenital_heart_defect, arm_swelling, 4.0).
disease_symptom_percent(congenital_heart_defect, infant_feeding_problem, 4.0).
disease_symptom_percent(congenital_heart_defect, slurring_words, 2.0).
disease_symptom_percent(congenital_heart_defect, irregular_belly_button_, 2.0).
disease_symptom_percent(congenital_heart_defect, cross-eyed, 2.0).
disease_symptom_percent(congenital_heart_defect, neck_cramps_or_spasms, 2.0).
disease_symptom_percent(congenital_heart_defect, decreased_heart_rate, 2.0).
disease_symptom_percent(congenital_heart_defect, excessive_appetite, 2.0).
disease_symptom_percent(congenital_heart_defect, hand_or_finger_stiffness_or_tightness, 2.0).

test_for_disease(congenital_heart_defect, radiographic_imaging_procedure).
test_for_disease(congenital_heart_defect, electrocardiogram).
test_for_disease(congenital_heart_defect, ultrasonography_(ultrasound)).
test_for_disease(congenital_heart_defect, echocardiography).
test_for_disease(congenital_heart_defect, other_diagnostic_procedures_(interview;_evaluation;_consultation)).
test_for_disease(congenital_heart_defect, cardiac_stress_tests).
test_for_disease(congenital_heart_defect, other_therapeutic_procedures).
test_for_disease(congenital_heart_defect, diagnostic_cardiac_catheterization;_coronary_arteriography).

treatment_for_disease(congenital_heart_defect, digoxin).
treatment_for_disease(congenital_heart_defect, captopril).
treatment_for_disease(congenital_heart_defect, palivizumab_(synagis)).
treatment_for_disease(congenital_heart_defect, chlorothiazide).
treatment_for_disease(congenital_heart_defect, treprostinil_(remodulin)).
treatment_for_disease(congenital_heart_defect, procainamide).
treatment_for_disease(congenital_heart_defect, ambrisentan_(letairis)).
treatment_for_disease(congenital_heart_defect, haemophilus_b_conjugate_vaccine).
treatment_for_disease(congenital_heart_defect, bosentan_(tracleer)).
treatment_for_disease(congenital_heart_defect, entecavir_(baraclude)).
treatment_for_disease(congenital_heart_defect, antihemophilic_factor_(obsolete)).
treatment_for_disease(congenital_heart_defect, pyrithione_zinc_topical).
treatment_for_disease(congenital_heart_defect, brompheniramine).

sexRisk(male ,congenital_heart_defect, 1.3).
sexRisk(female ,congenital_heart_defect, 0.8).

raceRisk(black,congenital_heart_defect, 1.0).
raceRisk(white, congenital_heart_defect, 0.9).
raceRisk(hispanic, congenital_heart_defect, 1.2).

yearRisk(0, congenital_heart_defect, 3.65).
yearRisk(1, congenital_heart_defect, 0.5).
yearRisk(2, congenital_heart_defect, 0.35).
yearRisk(3, congenital_heart_defect, 0.4).

disease_symptoms(hypertensive_heart_disease, [palpitations,shortness_of_breath,sharp_chest_pain,difficulty_breathing,weakness,fatigue,chest_tightness,insomnia,heartburn,leg_swelling,fluid_retention,recent_pregnancy]).

disease_symptom_percent(hypertensive_heart_disease, palpitations, 48.0).
disease_symptom_percent(hypertensive_heart_disease, shortness_of_breath, 45.0).
disease_symptom_percent(hypertensive_heart_disease, sharp_chest_pain, 44.0).
disease_symptom_percent(hypertensive_heart_disease, difficulty_breathing, 42.0).
disease_symptom_percent(hypertensive_heart_disease, weakness, 28.0).
disease_symptom_percent(hypertensive_heart_disease, fatigue, 26.0).
disease_symptom_percent(hypertensive_heart_disease, chest_tightness, 23.0).
disease_symptom_percent(hypertensive_heart_disease, insomnia, 15.0).
disease_symptom_percent(hypertensive_heart_disease, heartburn, 11.0).
disease_symptom_percent(hypertensive_heart_disease, leg_swelling, 8.0).
disease_symptom_percent(hypertensive_heart_disease, fluid_retention, 8.0).
disease_symptom_percent(hypertensive_heart_disease, recent_pregnancy, 4.0).

test_for_disease(hypertensive_heart_disease, hematologic_tests_(blood_test)).
test_for_disease(hypertensive_heart_disease, complete_blood_count_(cbc)).
test_for_disease(hypertensive_heart_disease, electrocardiogram).
test_for_disease(hypertensive_heart_disease, glucose_measurement_(glucose_level)).
test_for_disease(hypertensive_heart_disease, lipid_panel).
test_for_disease(hypertensive_heart_disease, ultrasonography_(ultrasound)).
test_for_disease(hypertensive_heart_disease, complete_physical_skin_exam_performed_(ml)).
test_for_disease(hypertensive_heart_disease, electrolytes_panel).

treatment_for_disease(hypertensive_heart_disease, amlodipine).
treatment_for_disease(hypertensive_heart_disease, carvedilol).
treatment_for_disease(hypertensive_heart_disease, isosorbide).
treatment_for_disease(hypertensive_heart_disease, rosuvastatin_(crestor)).
treatment_for_disease(hypertensive_heart_disease, valsartan_(diovan)).
treatment_for_disease(hypertensive_heart_disease, digoxin).
treatment_for_disease(hypertensive_heart_disease, diltiazem).
treatment_for_disease(hypertensive_heart_disease, spironolactone).
treatment_for_disease(hypertensive_heart_disease, benazepril).
treatment_for_disease(hypertensive_heart_disease, hydralazine).
treatment_for_disease(hypertensive_heart_disease, torsemide).
treatment_for_disease(hypertensive_heart_disease, hyzaar).

sexRisk(male ,hypertensive_heart_disease, 1.0).
sexRisk(female ,hypertensive_heart_disease, 1.0).

raceRisk(black,hypertensive_heart_disease, 1.0).
raceRisk(white, hypertensive_heart_disease, 1.0).
raceRisk(hispanic, hypertensive_heart_disease, 0.7).

yearRisk(0, hypertensive_heart_disease, 0.01).
yearRisk(1, hypertensive_heart_disease, 0.5).
yearRisk(2, hypertensive_heart_disease, 0.75).
yearRisk(3, hypertensive_heart_disease, 3.1).

symptom(abnormal_involuntary_movements).
symptom(apnea).
symptom(arm_pain).
symptom(arm_swelling).
symptom(burning_chest_pain).
symptom(chest_tightness).
symptom(cough).
symptom(cross-eyed).
symptom(decreased_heart_rate).
symptom(depression).
symptom(difficulty_breathing).
symptom(dizziness).
symptom(ear_pain).
symptom(elbow_cramps_or_spasms).
symptom(elbow_weakness).
symptom(excessive_appetite).
symptom(excessive_growth).
symptom(fainting).
symptom(fatigue).
symptom(feeling_ill).
symptom(fluid_retention).
symptom(hand_or_finger_stiffness_or_tightness).
symptom(heartburn).
symptom(hip_stiffness_or_tightness).
symptom(hurts_to_breath).
symptom(increased_heart_rate).
symptom(infant_feeding_problem).
symptom(insomnia).
symptom(irregular_belly_button_).
symptom(irregular_heartbeat).
symptom(itchy_eyelid).
symptom(lack_of_growth).
symptom(leg_swelling).
symptom(lower_body_pain).
symptom(lymphedema).
symptom(mouth_dryness).
symptom(muscle_pain).
symptom(nailbiting).
symptom(nausea).
symptom(neck_cramps_or_spasms).
symptom(pallor).
symptom(palpitations).
symptom(peripheral_edema).
symptom(plugged_feeling_in_ear).
symptom(recent_pregnancy).
symptom(sharp_chest_pain).
symptom(shortness_of_breath).
symptom(slurring_words).
symptom(sweating).
symptom(throat_feels_tight).
symptom(weakness).
symptom(weight_gain).
symptom(wrist_weakness).

test(cardiac_enzymes_measurement_(cardiac_enzymes_test)).
test(intravenous_fluid_replacement).
test(plain_x-ray_(x_ray)).
test(hematologic_tests_(blood_test)).
test(cardiac_stress_tests).
test(cat_scan_of_head_(head_ct)).
test(glucose_measurement_(glucose_level)).
test(echocardiography).
test(other_diagnostic_procedures_(interview;_evaluation;_consultation)).
test(lipid_panel).
test(x-ray_computed_tomography_(scan_ct)).
test(electrocardiogram).
test(wound_care_management).
test(electrolytes_panel).
test(ultrasonography_(ultrasound)).
test(diagnostic_cardiac_catheterization;_coronary_arteriography).
test(other_therapeutic_procedures).
test(cardiopulmonary_resuscitation_(cpr)).
test(kidney_function_tests_(kidney_function_test)).
test(radiographic_imaging_procedure).
test(complete_physical_skin_exam_performed_(ml)).
test(complete_blood_count_(cbc)).

treatment(polyethylene_glycol_3350_(miralax)).
treatment(clopidogrel_(plavix)).
treatment(ezetimibe_(zetia)).
treatment(antihemophilic_factor_(obsolete)).
treatment(diltiazem).
treatment(hyzaar).
treatment(bacitracin_(septa)).
treatment(etomidate).
treatment(cefdinir).
treatment(oxygen).
treatment(prazosin).
treatment(cortisone).
treatment(palivizumab_(synagis)).
treatment(glimepiride).
treatment(loratadine_(claritin)).
treatment(hydralazine).
treatment(zoledronic_acid_(reclast)).
treatment(triamterene).
treatment(niacin).
treatment(valsartan_(diovan)).
treatment(spironolactone).
treatment(glucosamine).
treatment(potassium_chloride).
treatment(bisoprolol_(emcor)).
treatment(quinapril).
treatment(propafenone).
treatment(insulin_aspart-insulin_aspart_protamine).
treatment(warfarin).
treatment(treprostinil_(remodulin)).
treatment(haemophilus_b_conjugate_vaccine).
treatment(torsemide).
treatment(pyrithione_zinc_topical).
treatment(amiodarone).
treatment(benazepril).
treatment(chondroitin).
treatment(digoxin).
treatment(chlorothiazide).
treatment(lutein).
treatment(dopamine).
treatment(dutasteride_(avodart)).
treatment(flecainide).
treatment(tenecteplase).
treatment(dorzolamide_ophthalmic).
treatment(dimenhydrinate_(dramamine)).
treatment(bosentan_(tracleer)).
treatment(influenza_virus_vaccine,_inactivated).
treatment(sodium_polystyrene_sulfonate_(kayexalate)).
treatment(bumetanide).
treatment(beclomethasone_(qvar)).
treatment(metoprolol).
treatment(captopril).
treatment(nitroglycerin).
treatment(hepatitis_a_vaccine_(obsolete)).
treatment(carvedilol).
treatment(carbon_dioxide).
treatment(amlodipine).
treatment(furosemide).
treatment(sotalol).
treatment(sodium_bicarbonate).
treatment(fenofibrate_(tricor)).
treatment(felodipine).
treatment(procainamide).
treatment(atropine_(uaa)).
treatment(aspirin).
treatment(glucagon).
treatment(adenosine).
treatment(heparin).
treatment(eptifibatide_(integrilin)).
treatment(metolazone).
treatment(entecavir_(baraclude)).
treatment(escitalopram_(lexapro)).
treatment(enoxaparin_(lovenox)).
treatment(rosuvastatin_(crestor)).
treatment(isosorbide).
treatment(brompheniramine).
treatment(ambrisentan_(letairis)).
treatment(esmolol).
treatment(allopurinol).
treatment(fondaparinux_(arixtra)).
treatment(isoproterenol).
treatment(mecamylamine).
treatment(ascorbic_acid).

sadrzi(S,[]).
sadrzi(S,[H|T]) :- member(H,S), sadrzi(S,T).

moguce_bolesti(S,B) :- disease_symptoms(B,S2), sadrzi(S2,S).

sum_percent([],B,0).
sum_percent([H|T],B,SUM):-disease_symptom_percent(B,H,P),sum_percent(T,B,SUM2),SUM is P+SUM2.

final_sum(GOD,POL,RACE,S,B,SUM):-sum_percent(S,B,SUM1),sexRisk(POL,B,SK),raceRisk(RACE,B,RK),yearRisk(GOD,B,YK), SUM is SUM1*SK*RK*YK.

koef(GOD,POL,RACE,B,KFF):-sexRisk(POL,B,SK),raceRisk(RACE,B,RK),yearRisk(GOD,B,YK), KFF is SK*RK*YK.

pozitivni([],[]).
pozitivni([H|T], L) :- H >= 0, pozitivni(T,L1), append([H],L1,L).
pozitivni([H|T], L) :- H < 0, pozitivni(T,L).