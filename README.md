# Certificacion Calidad (PTP: prueba teórico-práctica)

El presente repositorio es usado como base para iniciar la prueba de automatización que esta contemplada dentro del proceso de Certificación para las personas de Calidad.

A continuación se presenta un conjunto de actividades que deben ser contempladas durante la prueba de automatización:

Actividad            | Consideraciones importantes
:------------------- |:-------------------------------------
0. Precedente |*Antes del inicio de la prueba automatizada* la persona de Calidad ya debió haber desarrollado ciertas **actividades** y/o análisis sobre un **ejercicio planteado** como parte del proceso de certificación.
 | Para el desarrollo de la automatización debe tener en cuenta:
 | - El **ejercicio planteado** en días pasados.
 | - Las **actividades previamente** analizadas y solucionadas en relación con el ejercicio planteado.
 | - La información y/o indicaciones recibidas por medio de correo electrónico (*en donde se expresa la visita al presente repositorio*)
1. Cree una rama a partir del repositorio actual (dicha rama debe ser usada para desarrollar la automatización de la prueba)|El nombre de la rama debe poseer el siguiente formato: feature/CERT_PTP_1er_nombre_1er_apellido_fecha_DDMMAAAA
|**Ejemplo** (nombre de la rama): feature/CERT_PTP_Luis_Florez_15052019
|Es requerido que el repositorio original **NO** sea modificado; por tal motivo debe realizar la prueba en la rama generada.
2. Cree su proyecto de automatización en la rama creada|En la rama creada: adicione las carpetas, configuraciones, recursos, y demás archivos que deban componer el proyecto de automatización para su correcta ejecución.
3. Realice la automatización del escenario de prueba seleccionado y/o planteado en la prueba|El escenario de prueba debe contemplar un flujo completo de negocio (*tenga en cuenta la intensión final del negocio planteado en la prueba*)
|Use datos de prueba dinámicos (*es decir *no incrustar* los datos de prueba dentro de las clases del proyecto*)
|Dentro de los recursos del proyecto incluya una carpeta llamada: "*solucionfuncional*".
|En la carpeta "*solucionfuncional*" guarde el archivo de MS Excel que contiene la solución a las actividades que ha desarrollado hasta este momento como parte del proceso de certificación.
|La ejecución del escenario de prueba automatizado debe ser satisfactoria mediante línea de comando.
4. Genere pull request con el proyecto de automatización desarrollado|El pull request debe estar dirigido/asignado a las personas que hayan sido definidas en el correo electrónico donde se expresa la visita al presente repositorio (en su defecto: por favor asignar la solicitud al revisor: "certificacion_calidad")
|**Adicionalmente**: por favor agrege un comentario al pull request donde indique el comando con el cual se debe ejecutar la(s) prueba(s) automatizada(s) desde consola.
|Opcional: Se recomienda adjuntar en el pull request una imagen que evidencie la ejecución correcta del(de los) escenario(s) de prueba.
|Antes de enviar la solicitud de pull request: por favor seleccione la opción de: "Close master after the pull request is merged" / "Cerrar master después que la solicitud sea fusionada"
5. Notifique vía email la finalización de la automatización|Indique en el correo:
|*a)* Nombre de la rama donde desarrolló la automatización.
|*b)* Comando con el cual se debe ejecutar la(s) prueba(s) automatizada(s) desde consola.