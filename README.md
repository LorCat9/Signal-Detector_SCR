# Homework di Software Cognitive Radio 
### Studenti:
* Lorenzo Catalli
### Testo:
Sono assegnate 3 sequenze di 10^6 campioni complessi, osservate a 4 diversi SNR (-3, +2, -8, -13 dB), in accordo all'ordine delle sequenze) determinare tramite il metodo di Energy Detection in quali e quante sequenze sia presente il segnale dell'utente primario a potenza unitaria e modulato QPSK, lavorando con un livello di falso allarme fissato a 10^-2. 
Progettare una funzione/un metodo/una classe per la detection di eventuale segnale utile immerso in rumore gaussiano.
### Obiettivo: 
* Calcolare le soglie ad un Pfa dato e per i vari SNR.
* Rilevare l'eventuale presenza del segnale primario all'interno delle sequenza date (in percentuale).
### Output:
#### Soglie:
 - Soglia -> SNR(db): -13.0 || Pfa: 0.01 || Valore: 21.849888966345002
 - Soglia -> SNR(db): -8.0 || Pfa: 0.01 || Valore: 6.998324527300708
 - Soglia -> SNR(db): -3.0 || Pfa: 0.01 || Valore: 2.2286855927169134
 - Soglia -> SNR(db): 2.0 || Pfa: 0.01 || Valore: 0.7054443753552511

#### primo segnale:
 - SNR: -3.0 || Percentuale presenza utente primario: 0.5%
 - SNR: 2.0 || Percentuale presenza utente primario: 0.9%
 - SNR: -8.0 || Percentuale presenza utente primario: 2.1%
 - SNR: -13.0 || Percentuale presenza utente primario: 2.3%

#### secondo segnale:
 - SNR: -3.0 || Percentuale presenza utente primario: 100.0%
 - SNR: 2.0 || Percentuale presenza utente primario: 100.0%
 - SNR: -8.0 || Percentuale presenza utente primario: 99.9% 
 - SNR: -13.0 || Percentuale presenza utente primario: 55.0%

#### terzo segnale:
 - SNR: -3.0 || Percentuale presenza utente primario: 0.8%
 - SNR: 2.0 || Percentuale presenza utente primario: 0.5%
 - SNR: -8.0 || Percentuale presenza utente primario: 1.6%
 - SNR: -13.0 || Percentuale presenza utente primario: 1.8%
#### commenti:
 - Essendo la generazione dei campioni un evento randomico, i valori delle soglie e dunque le percentuali di presenza dell'utente primario possono variare ad ogni nuova esecuzione. 
