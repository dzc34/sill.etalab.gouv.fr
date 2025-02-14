(ns sillweb.i18n
  (:require [taoensso.tempura :refer [tr]]))

(def supported-languages #{"fr" "en" "de"})

(def localization
  ;; French translation
  {:fr
   {
    :about                   "À propos"
    :affiliation-placeholder "Par ex. DGFiP"
    :all                     "Tous"
    :back-to-websie          "Retour au site principal"
    :clear-filters           "Effacer les filtres"
    :contact                 "Contact"
    :contact-baseline        "Envie de contribuer ? Un point à éclaircir ? Sollicitez-nous !"
    :contact-by-email        "Contacter par email"
    :contact-form            "Formulaire de contact"
    :context-of-use          "Contexte d'usage :"
    :download                "Télécharger"
    :email-placeholder       "Par ex. toto@modernisation.gouv.fr"
    :free-search             "Recherche libre"
    :function                "Fonction :"
    :go-to-source            "Voir le code source"
    :go-to-website           "Visiter le site web"
    :here                    "ici"
    :keywords                "Liste des logiciels libres recommandés par l'État"
    :license                 "Licence"
    :licenses                "Licences"
    :main-etalab-website     "Site principal d'Etalab"
    :message-placeholder     "Votre message"
    :message-received        "Message reçu !"
    :message-received-ok     "Nous nous efforçons de répondre au plus vite."
    :mimall                  "Tout type"
    :mimdev                  "Développement (MIMDEV)"
    :mimo                    "Bureautique (MIMO)"
    :mimprod                 "Production (MIMPROD)"
    :name                    "Nom"
    :no-sws-found            "Pas de logiciel trouvé : une autre idée de requête ?"
    :on-comptoir             "Fiche Comptoir du libre"
    :on-framalibre           "Sur Framalibre : "
    :one-sw                  "logiciel"
    :read-the-docs           "Lire la documentation"
    :recommended             "Recommandés"
    :recommended_version     "Version utilisée et recommandée"
    :sort-alpha              "A-Z <=> Z-A"
    :source-code-available   ", code source disponible "
    :submit                  "Envoyer"
    :sws                     "logiciels"
    :tested                  "En observation"
    :version                 "Version: "
    :warning-testing         "Ce logiciel est actuellement en observation."
    :website-developed-by    "Site développé par la mission "
    :why-this-website?       "Pourquoi ce site ?"
    :your-affiliation        "Votre organisme de rattachement"
    :your-email              "Votre adresse de courriel"
    :your-message            "Message"
    :your-name               "Votre nom"
    }
   :en
   {
    :about                   "About"
    :affiliation-placeholder "E.g. DGFiP"
    :all                     "All"
    :back-to-websie          "Back to the main website."
    :clear-filters           "Clear filters"
    :contact                 "Contact"
    :contact-baseline        "Want to contribute? A question? Contact us!"
    :contact-by-email        "Contact by email"
    :contact-form            "Contact form"
    :context-of-use          "Context of use:"
    :download                "Download"
    :email-placeholder       "E.g. toto@modernisation.gouv.fr"
    :free-search             "Free search"
    :function                "Function:"
    :go-to-source            "Browse the source code"
    :go-to-website           "Visit the website"
    :here                    "here"
    :keywords                "List of recommended software by the public sector"
    :license                 "License"
    :licenses                "Licenses"
    :main-etalab-website     "Etalab main website"
    :message-placeholder     "Your message"
    :message-received        "Message received!"
    :message-received-ok     "We will reply as soon as possible."
    :mimall                  "All types"
    :mimdev                  "Development tools"
    :mimo                    "Office tools"
    :mimprod                 "Production tools"
    :name                    "Name"
    :no-sws-found            "No software found: try another query?"
    :on-comptoir             "On Comptoir du libre"
    :on-framalibre           "On Framalibre: "
    :one-sw                  "software"
    :read-the-docs           "Read the documentation"
    :recommended             "Recommandés"
    :recommended_version     "Used and recommended version"
    :sort-alpha              "A-Z <=> Z-A"
    :source-code-available   ", source code available "
    :submit                  "Send"
    :sws                     "software"
    :tested                  "En observation"
    :version                 "Version: "
    :warning-testing         "This software is currently being tested."
    :website-developed-by    "Website developed by "
    :why-this-website?       "Why this website?"
    :your-affiliation        "Your affiliation"
    :your-email              "Your email address"
    :your-message            "Message"
    :your-name               "Your name"
    }
   :de
   {
    :about                   "Über uns"
    :affiliation-placeholder "z.B. DGFiP"
    :all                     "Alle"
    :back-to-websie          "Home"
    :clear-filters           "Filter löschen"
    :contact                 "Kontakt"
    :contact-baseline        "Sie haben Fragen oder Anregungen ? Schreiben Sie uns !"
    :contact-by-email        "Kontakt per Email."
    :contact-form            "Kontaktformular"
    :context-of-use          "Nutzungskontext:"
    :download                "Download"
    :email-placeholder       "z.B. toto@modernisation.gouv.fr"
    :free-search             "Freie Suche"
    :function                "Funktion:"
    :go-to-source            "Quellcode sehen"
    :go-to-website           "Webseite besuchen"
    :here                    "hier"
    :keywords                "Empfohlene open source Software für die öffentliche Verwaltung"
    :license                 "Lizenz"
    :licenses                "Lizenzen"
    :main-etalab-website     "Webseite von Etalab"
    :message-placeholder     "Ihre Nachricht"
    :message-received        "Nachricht erhalten !"
    :message-received-ok     "Sie hören bald von uns !"
    :mimall                  "Alle"
    :mimdev                  "Software-Entwicklung (MIMDEV)"
    :mimo                    "Bürosoftware (MIMO)"
    :mimprod                 "Produktion (MIMPROD)"
    :name                    "Name"
    :no-sws-found            "Keine Ergebnisse : Versuchen Sie einen anderen Suchbegriff."
    :on-comptoir             "Auf Comptoir du libre"
    :on-framalibre           "Auf Framalibre : "
    :one-sw                  "Software"
    :read-the-docs           "Dokumentation leseen"
    :recommended             "Empfohlen"
    :recommended_version     "Genutzte und empfohlene Version"
    :sort-alpha              "A-Z <=> Z-A"
    :source-code-available   ", Sourcecode verfügbar "
    :submit                  "Abschicken"
    :sws                     "Software"
    :tested                  "In Beobachtung"
    :version                 "Version: "
    :warning-testing         "Evaluierung dieser Software noch nicht abgeshlossen."
    :website-developed-by    "Webseite entwickelt von "
    :why-this-website?       "Warum diese Webseite ?"
    :your-affiliation        "Organisation"
    :your-email              "Email-Adresse"
    :your-message            "Nachricht"
    :your-name               "Name"
    }
   })

(def opts {:dict localization})

(defn i [lang input] (tr opts [lang] input))
