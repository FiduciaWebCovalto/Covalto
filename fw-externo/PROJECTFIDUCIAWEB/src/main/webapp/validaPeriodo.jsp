if( document.Movs.txtFechaI.value.substr(0,2) > document.Movs.txtFechaF.value.substr(0,2)  && document.Movs.txtFechaI.value.substr(3,2) == document.Movs.txtFechaF.value.substr(3,2))
															   {
																  alert("La fecha inicial debe ser menor que la final")
																document.Movs.cboCalendarioI.focus();
																  return;
															   }
														if( document.Movs.txtFechaI.value.substr(3,2) > document.Movs.txtFechaF.value.substr(3,2) &&   document.Movs.txtFechaI.value.substr(6,4) == document.Movs.txtFechaF.value.substr(6,4))
															   {
																  alert("La fecha inicial debe ser menor que la final")
																document.Movs.cboCalendarioI.focus();
																  return;
															   }
													   if( document.Movs.txtFechaI.value.substr(6,4) > document.Movs.txtFechaF.value.substr(6,4))
															   {
																  alert("La fecha inicial debe ser menor que la final")
																  document.Movs.cboCalendarioI.focus();
																  return;
															   }
													