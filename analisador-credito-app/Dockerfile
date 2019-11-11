FROM nginx:1.14.1-alpine

## Copia o arquivo default.conf padrão para a pasta conf.d dentro do container
COPY nginx/default.conf /etc/nginx/conf.d/

## Remove o arquivo padrão do nginx
RUN rm -rf /usr/share/nginx/html/*

## Copia todas os arquivos construídos do projeto para a pasta html dentro do container
COPY build/* /usr/share/nginx/html/
ADD build/static /usr/share/nginx/html/static
RUN ls /usr/share/nginx/html

CMD ["nginx", "-g", "daemon off;"]