export class Pacient {
    id ?: number;
    ime ?: string;
    prezime ?: string;
    godiste ?: number;
    JMBG ?: string;
    rasa ?: string;
    pol ?: string;
    pregledi ?: any;
    telefon ?: string;
    adresa ?: string;

    pusac ?: boolean;
    alkohol ?: boolean;
    debljina ?: string;
    porodicneBolesti ?: Array<string>;
    istorijaBolesti ?: Array<string>;


}