<?php
	        $atual = new DateTime();
            $especifica = new DateTime('1990-01-22');
            $texto = new DateTime(' +1 month');
            //$semana = new DateTime('+1 week');
            //$dia    = new DateTime('+1 day');
            //$ano 	  = new DateTime('+1 year');

          	//print_r($atual);
            //print_r($especifica);
            //print_r($texto);

            //$dia = $atual->format('d');
            //$mes = $atual->format('m');
            //$ano = $atual->format('Y');
            
			if($atual>$especifica){
				$atual = $atual->format('d/m/Y');
				$especifica = $especifica->format('d/m/Y');
				echo" <br>ok $atual é maior que $especifica";
				//ele reconheceu qual data é mais proxima
			}


?>