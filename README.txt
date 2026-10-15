VOLCANES DE COLOMBIA - App Android (Java)
Versiones: Gradle 9.5.0, AGP 9.3.3, compileSdk 37 (iguales a tu proyecto "imagenes").

COMO ABRIRLA
1. Descomprime el zip.
2. Android Studio > File > Open > carpeta "volcanes" (la que tiene settings.gradle.kts).
3. Espera el Gradle Sync.
4. Pulsa Run.

COMO PONER TUS IMAGENES
En app/src/main/res/drawable/ hay 6 imagenes de relleno. Reemplazalas por tus fotos
con EXACTAMENTE el mismo nombre:

  nevado_ruiz.jpg
  nevado_huila.jpg
  galeras.jpg
  purace.jpg
  cumbal.jpg
  azufral.jpg

- Si tu foto es .jpg: copiala encima y acepta reemplazar.
- Si es .png u otro formato: BORRA primero la de relleno con el mismo nombre
  y luego agrega la tuya (si quedan las dos da error "Duplicate resources").
- Nombres en minusculas, sin espacios ni tildes. Menos de 1 MB cada una.

SUBIR A GITHUB (Terminal de Android Studio)
  git init
  git add .
  git commit -m "App Volcanes de Colombia"
  git branch -M main
  git remote add origin https://github.com/TU_USUARIO/volcanes.git
  git push -u origin main
